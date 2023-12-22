package com.lpms.controller;

import com.lpms.dao.impl.DaoImpl;
import com.lpms.pojo.monitor.MonitoringRecord;

import java.util.Date;
import java.util.Scanner;

/**
 * 监测人员页面
 */
public class MonPersonnelController {
    int chooseFunction;
    Scanner scanner;
    UserSharingController userSharingController;
    private void initController(){
        //初始化控制器函数
        scanner=new Scanner(System.in);
        userSharingController=new UserSharingController();
    }
    public void indexIn(){
        initController();
        while(true){
            System.out.println("请选择：1.园林植物基本信息查询 2.查询监测数据 3.录入监测数据 4.删除监测数据 5.修改监测数据");
            chooseFunction=scanner.nextInt();
            scanner.nextLine();
            switch (chooseFunction){
                case 1:
                    userSharingController.plantBasicQuery();
                    break;
                case 2:
                    userSharingController.queryMonitoringRecord();
                    break;
                case 3:
                    addMonRecord();
                    break;
                case 4:
                    deleteMonRecord();
                    break;
                case 5:
                    updateMonRecord();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }
    /**
     * 监测人员特有：增删改监测数据
     */
    void addMonRecord(){
        //进行插入数据库操作
        MonitoringRecord monitoringRecord = inAndGetMonitoringRecord();
        if(monitoringRecord!=null){
            DaoImpl.monitoringRecordDAO.insertMonitoringRecord(monitoringRecord);
        }
    }

    void updateMonRecord(){
        //进行更新监测记录到数据库的操作
        System.out.println("请输入要更新的监测记录ID");
        int monRecordId=getUpdateOrDeleteMonId();
        if(monRecordId==0){
            System.out.println("不存在对应的监测记录，退出");
            return;
        }

        MonitoringRecord monitoringRecord = inAndGetMonitoringRecord();
        if(monitoringRecord!=null){
            monitoringRecord.setMonId(monRecordId);
            DaoImpl.monitoringRecordDAO.updateMonitoringRecord(monitoringRecord);
        }
    }

    void deleteMonRecord(){
        //进行删除监测记录的操作
        System.out.println("请输入要删除的监测记录ID");
        int monRecordId=getUpdateOrDeleteMonId();
        if(monRecordId==0){
            System.out.println("不存在对应的监测记录，退出");
            return;
        }

        DaoImpl.monitoringRecordDAO.deleteMonitoringRecordById(monRecordId);
    }

    int getUpdateOrDeleteMonId(){
        int monRecordId=scanner.nextInt();
        scanner.nextLine();
        if(DaoImpl.monitoringRecordDAO.getMonitoringRecordById(monRecordId)==null){
            return 0;
        }
        return monRecordId;
    }

    MonitoringRecord inAndGetMonitoringRecord()
    {
        //录入监测数据，注意这里要进行监测数据判断是否正常，然后插入mon_is_normal字段
//        Integer monId(自动生成), Date monDate(现在，自动生成), Integer monPlantId, Integer userId,
//        Integer devId, Float monStemGrowth, Float monFruitGrowth, Float monCanopyTemperature,
//        Float monLeafTemperature, boolean monIsNormal(自动生成)
//        Scanner scanner2=new Scanner(System.in);
        System.out.println("请跟随指引输入监测数据");

        System.out.println("请输入监测植物id");
        int monPlantId=scanner.nextInt();
        scanner.nextLine();
        if(DaoImpl.plantDao.selectPlantById(monPlantId)==null){
            //判断监测的植物是否存在
            System.out.println("监测植物ID输入错误，退出");
            return null;
        }

        System.out.println("请输入监测人员ID");
        int userId=scanner.nextInt();
        scanner.nextLine();
        if(DaoImpl.userDAO.getMonUserById(userId)==null){
            //判断监测人员是否存在
            System.out.println("监测人员ID输入错误，退出");
            return null;
        }

        System.out.println("请输入监测设备ID");
        int devId=scanner.nextInt();
        scanner.nextLine();
        if(DaoImpl.deviceDAO.getDeviceByDevId(devId)==null){
            //判断监测设备是否存在
            System.out.println("监测设备ID输入错误，退出");
            return null;
        }

        System.out.println("请输入监测数据");
        //根据监测设备可以监测的指标进行输入
        // Float monStemGrowth, Float monFruitGrowth, Float monCanopyTemperature,
        //        Float monLeafTemperature
        //注意茎干和果实是不允许有0或者负数的
        String monStemGrowth=null,monFruitGrowth=null,monCanopyTemperature=null,monLeafTemperature=null;
        Float fMonStemGrowth=null,fMonFruitGrowth=null,fMonCanopyTemperature=null,fMonLeafTemperature=null;
        switch (devId){
            case 1:
                //红外线测温仪infrared thermometer输入
                System.out.println("请输入冠层温度，如未测量请直接按下回车键");
                monCanopyTemperature=scanner.nextLine();
                if(isValueFloat(monCanopyTemperature)){
                    fMonCanopyTemperature=Float.parseFloat(monCanopyTemperature);
                }
                System.out.println("请输入叶面温度，如未测量请直接按下回车键");
                monLeafTemperature=scanner.nextLine();
                if(isValueFloat(monLeafTemperature)){
                    fMonLeafTemperature=Float.parseFloat(monLeafTemperature);
                }
                break;
            case 2:
                //茎干测量仪输入
                System.out.println("请输入茎干直径，如未测量请直接按下回车键");
                monStemGrowth=scanner.nextLine();
                if(isValueFloat(monStemGrowth)){
                    fMonStemGrowth=Float.parseFloat(monStemGrowth);
                    if(fMonStemGrowth<=0){
                        System.out.println("茎干直径不可小于等于0");
                        return null;
                    }
                }
                break;
            case 3:
            case 4:
                //数字式卷尺输入
                //DEX果实-树木茎干生长测量仪DEX Fruit - tree stem growth measuring instrument输入
                System.out.println("请输入茎干直径，如未测量请直接按下回车键");
                monStemGrowth=scanner.nextLine();
                if(isValueFloat(monStemGrowth)){
                    fMonStemGrowth=Float.parseFloat(monStemGrowth);
                    if(fMonStemGrowth<=0){
                        System.out.println("茎干直径不可小于等于0");
                        return null;
                    }
                }

                System.out.println("请输入果实大小，如未测量请直接按下回车键");
                monFruitGrowth=scanner.nextLine();
                if(isValueFloat(monFruitGrowth)){
                    fMonFruitGrowth=Float.parseFloat(monFruitGrowth);
                    if(fMonFruitGrowth<=0){
                        System.out.println("果实大小不可小于等于0");
                        return null;
                    }
                }
                break;
            default:
                System.out.println("监测设备ID输入错误，退出");
                return null;
        }

        //判断监测数据是否正常
        boolean monIsNormal=false;
        if(isMonitorRecordNormal(fMonStemGrowth,fMonFruitGrowth, fMonCanopyTemperature,fMonLeafTemperature))
        {
            //正常设置字段正常
            monIsNormal=true;
        }

//        scanner2.close();

        return new MonitoringRecord(null,new Date(),monPlantId,userId,
                devId,fMonStemGrowth,fMonFruitGrowth,fMonCanopyTemperature,fMonLeafTemperature,monIsNormal);
    }

    boolean isValueFloat(String str){
        //判断输入的值是不是Float
        if(str.isEmpty()||str==null){
            return false;
        }
        try {
            Float floatValue = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            System.out.println("字符串无法转换为 Float 类型，将按照输入为空处理");
            return false;
        }
        return true;
    }

    boolean isMonitorRecordNormal(Float fMonStemGrowth,Float fMonFruitGrowth,
                                  Float fMonCanopyTemperature,Float fMonLeafTemperature){
        //判断监测数据是否正常
        if(fMonStemGrowth!=null&&fMonStemGrowth<20){
            //茎干判断，小于20则异常
            return false;
        }
        if(fMonFruitGrowth!=null&&fMonFruitGrowth<10){
            //果实大小判断，小于10则异常
            return false;
        }
        if(fMonCanopyTemperature!=null&&(fMonCanopyTemperature<3||fMonCanopyTemperature>13)){
            //冠层温度小于3，大于13则异常
            return false;
        }
        if(fMonLeafTemperature!=null&&(fMonLeafTemperature<3||fMonLeafTemperature>13)){
            //叶面温度小于3，大于13则异常
            return false;
        }
        return true;
    }


}
