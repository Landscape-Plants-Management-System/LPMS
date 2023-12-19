package com.lpms.controller;

import com.lpms.dao.ClassificationDao;
import com.lpms.dao.impl.DaoImpl;
import com.lpms.pojo.classification.*;
import com.lpms.pojo.monitor.Device;
import com.lpms.pojo.monitor.MonitoringPlantDetailInfo;
import com.lpms.pojo.monitor.MonitoringRecordShow;
import com.lpms.pojo.monitor.MonitoringStatistics;
import com.lpms.pojo.plant.PlantInfo;
import com.lpms.pojo.plant.Plant_Count;
import com.lpms.pojo.plant.Plant_number;
import com.lpms.utils.StringToDate;

import java.util.List;
import java.util.Scanner;

/**
 * 有共享情况的功能
 */
public class UserSharingController {
    /**
     * 植物基本信息相关查询
     */
    private void showAllPlantInfo(){
        System.out.println("平台所有植物信息展示");
        List<PlantInfo> plantInfos = DaoImpl.plantDao.selectAllPlant();
        for (PlantInfo plantInfo : plantInfos) {
            System.out.println(plantInfo);
        }
//        for (Device listDevice : DaoImpl.deviceDAO.listDevices()) {
//            System.out.println(listDevice);
//        }

    }

    private void searchPlantBySpecies(){
        //查询种
        System.out.println("平台所有种信息展示");
        List<Species> species = DaoImpl.classificationDao.listSpecies();
        for (Species species1 : species) {
            System.out.println(species1);
        }
    }
    private void getSpeciesBySpeciesName(){
        //根据名字查询种
        System.out.println("请输入种名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        Species speciesBySpeciesName = DaoImpl.classificationDao.getSpeciesBySpeciesName(keyword);
        System.out.println(speciesBySpeciesName);
    }
    private void searchPlantByGenuses(){
        //查询属
        System.out.println("平台所有属信息展示");
        List<Genus> genuses = DaoImpl.classificationDao.listGenuses();
        for (Genus genus : genuses) {
            System.out.println(genus);
        }
    }
    private void getGenusByGenusName(){
        //根据名字查询属
        System.out.println("请输入属名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        Genus genusByGenusName = DaoImpl.classificationDao.getGenusByGenusName(keyword);
        System.out.println(genusByGenusName);
    }
    private void searchPlantByFamily(){
        //查询科
        System.out.println("平台所有科信息展示");
        List<Family> families = DaoImpl.classificationDao.listFamilies();
        for (Family family : families) {
            System.out.println(family);
        }
    }
    private void getFamilyByFamilyName(){
        //根据名字查询科
        System.out.println("请输入科名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        Family familyByFamilyName = DaoImpl.classificationDao.getFamilyByFamilyName(keyword);
        System.out.println(familyByFamilyName);
    }

    private void plantCount(){
        //统计平台每种植物的数量
        System.out.println("每种植物的数量");
        List<Plant_number> plantNumbers = DaoImpl.plantDao.countPlant();
        for (Plant_number plantNumber : plantNumbers) {
            System.out.println(plantNumber);
        }
    }

    private void getSimpleClassificationInfo(){
        //查看简易的植物分类信息，也可用于生长环境等所有字段的模糊查询
        System.out.println("请输入查询关键字（可用于生长环境等所有字段的模糊查询）");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        for (Simple_Classification_Info simpleClassificationInfo : DaoImpl.classificationDao.getSimpleClassificationInfo(keyword)) {
            System.out.println(simpleClassificationInfo);
        }

    }
    private void getCompleteClassificationInfo(){
        //查看完整的植物分类信息
        System.out.println("完整的植物分类信息");
        for (Complete_Classification_Info completeClassificationInfo : DaoImpl.classificationDao.getCompleteClassificationInfo()) {
            System.out.println(completeClassificationInfo);
        }
    }
    private void findSubordinatePlantsFamily(){
        //根据指定属性查找下属的植物
        System.out.println("请输入科名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        for (Family_Genus_Species_Info subordinatePlant : DaoImpl.classificationDao.findSubordinatePlantsFamily(keyword)) {
            System.out.println(subordinatePlant);
        }
    }

    private void findSubordinatePlantsGenus(){
        //根据指定属性查找下属的植物
        System.out.println("请输入属名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        for (Family_Genus_Species_Info subordinatePlant : DaoImpl.classificationDao.findSubordinatePlantsGenus(keyword)) {
            System.out.println(subordinatePlant);
        }
    }

    public void plantBasicQuery(){
        System.out.println("请选择查询项目：1.平台所有植物信息 2.平台所有种信息 3.平台所有属信息 4.平台所有科信息 5.每种植物的数量");
        System.out.println("请选择查询项目：6.查询简易植物分类信息 7.查看完整的植物分类信息 8.根据科名查找下属的植物 9.根据属名查找下属的植物");
        System.out.println("请选择查询项目：10.根据种名查询信息 11.根据属名查询属的信息 12.根据科名查询科的信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                showAllPlantInfo();
                break;
            case 2:
                searchPlantBySpecies();
                break;
            case 3:
                searchPlantByGenuses();
                break;
            case 4:
                searchPlantByFamily();
                break;
            case 5:
                plantCount();
                break;
            case 6:
                getSimpleClassificationInfo();
                break;
            case 7:
                getCompleteClassificationInfo();
                break;
            case 8:
                findSubordinatePlantsFamily();
                break;
            case 9:
                findSubordinatePlantsGenus();
                break;
            case 10:
                getSpeciesBySpeciesName();
                break;
            case 11:
                getGenusByGenusName();
                break;
            case 12:
                getFamilyByFamilyName();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    /**
     *  上级主管部门和监测人员共享：查询监测数据
     */
    private void listMonitoringRecord(){
        //查看所有监测记录
        System.out.println("所有监测记录");
        for (MonitoringRecordShow monitoringRecordShow : DaoImpl.monitoringRecordDAO.listMonitoringRecord()) {
            System.out.println(monitoringRecordShow);
        }
    }
    private void listMonitoringPlantDetailInfo(){
        //查看植物详细信息及检测指标
        System.out.println("植物详细信息及检测指标");
        for (MonitoringPlantDetailInfo monitoringPlantDetailInfo : DaoImpl.monitoringRecordDAO.listMonitoringPlantDetailInfo()) {
            System.out.println(monitoringPlantDetailInfo);
        }
    }
    private void getMonitoringStatistics(){
        //所有监测数据的平均值、最大值、最小值
        System.out.println("所有监测数据的平均值、最大值、最小值");
        MonitoringStatistics monitoringStatistics = DaoImpl.monitoringRecordDAO.getMonitoringStatistics();
        System.out.println(monitoringStatistics);
    }
    private void getMonitoringStatisticsByPlantName(){
        //根据指定种名查询某种植物的4个数据的平均值，最大值，最小值查询
        System.out.println("请输入种名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        MonitoringStatistics monitoringStatisticsByPlantName = DaoImpl.monitoringRecordDAO.getMonitoringStatisticsByPlantName(keyword);
        System.out.println(monitoringStatisticsByPlantName);
    }
    private void getMonitoringStatisticsByGenusName(){
        //根据指定属名查询某属植物的4个数据的平均值，最大值，最小值查询
        System.out.println("请输入属名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        MonitoringStatistics monitoringStatisticsByGenusName = DaoImpl.monitoringRecordDAO.getMonitoringStatisticsByGenusName(keyword);
        System.out.println(monitoringStatisticsByGenusName);
    }
    private void getMonitoringStatisticsByFamilyName(){
        //根据指定科名查询某科植物的4个数据的平均值，最大值，最小值查询
        System.out.println("请输入科名");
        Scanner scanner=new Scanner(System.in);
        String keyword=scanner.nextLine();
        MonitoringStatistics monitoringStatisticsByFamilyName = DaoImpl.monitoringRecordDAO.getMonitoringStatisticsByFamilyName(keyword);
        System.out.println(monitoringStatisticsByFamilyName);
    }
    private void getMonitoringStatisticsByDateRange(){
        //查询某段时间植物的监测数据
        System.out.println("请输入开始时间，格式：yyyy-MM-dd HH:mm:ss");
        Scanner scanner=new Scanner(System.in);
        String startDate=scanner.nextLine();
        System.out.println("请输入结束时间，格式：yyyy-MM-dd HH:mm:ss");
        String endDate=scanner.nextLine();
        MonitoringStatistics monitoringStatisticsByDateRange = DaoImpl.monitoringRecordDAO.getMonitoringStatisticsByDateRange(StringToDate.getStringToDate(startDate), StringToDate.getStringToDate(endDate));
        System.out.println(monitoringStatisticsByDateRange);
    }
    public void queryMonitoringRecord(){
        System.out.println("请选择查询项目：1.所有监测记录 2.植物详细信息及检测指标 3.所有监测数据的平均值、最大值、最小值 " +
                "4.查询某种植物的监测数据的平均值，最大值，最小值  5.查询某属植物的监测数据的平均值，最大值，最小值" +
                "6.查询某科植物的监测数据的平均值，最大值，最小值  7.查询某段时间所有植物的监测数据" );
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        switch (choose){
            case 1:
                listMonitoringRecord();
                break;
            case 2:
                listMonitoringPlantDetailInfo();
                break;
            case 3:
                getMonitoringStatistics();
                break;
            case 4:
                getMonitoringStatisticsByPlantName();
                break;
            case 5:
                getMonitoringStatisticsByGenusName();
                break;
            case 6:
                getMonitoringStatisticsByFamilyName();
                break;
            case 7:
                getMonitoringStatisticsByDateRange();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

}
