package com.lpms.controller;

import com.lpms.dao.PlantDao;
import com.lpms.dao.impl.DaoImpl;
import com.lpms.pojo.Role;
import com.lpms.pojo.User;
import com.lpms.pojo.classification.*;
import com.lpms.pojo.disease.Disease;
import com.lpms.pojo.disease.Method;
import com.lpms.pojo.monitor.Device;
import com.lpms.pojo.plant.Plant;
import com.lpms.utils.SqlSessionUtils;

import java.util.List;
import java.util.Scanner;

/**
 * 系统管理员页面
 */
public class SysAdminController {
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
            System.out.println("请选择想要操作的数据表：1.科表 2.属表 3.种表 4.分布区域表 5.生长环境表 6.生长周期表 7.养护任务表 " +
                    "8.监测设备表 9.监测记录表 10.病虫害表 11.防治方法表 12.地点表 13.plant表 14.用户（人员）表");
            System.out.println("查询操作选择：15.园林植物基本信息查询");
            chooseFunction=scanner.nextInt();
            switch (chooseFunction){
                case 1:
                    FamilyController();
                    break;
                case 2:
                    GenusController();
                    break;
                case 3:
                    SpeciesController();
                    break;
                case 4:
                    DistributionController();
                    break;
                case 5:
                    EnvironmentController();
                    break;
                case 6:
                    GrowthController();
                    break;
                case 8:
                    DeviceController();
                    break;
                case 9:
                    MonitoringRecordController();
                    break;
                case 10:
                    DiseaseController();
                    break;
                case 11:
                    MethodController();
                    break;
                case 13:
                    insertPlant();
                    break;
                case 14:
                    UserController();
                    break;
                case 15:
                    userSharingController.plantBasicQuery();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }

    public void FamilyController(){
        System.out.println("请选择操作：1.插入一条科表信息 2.删除一条科表信息 3.更新一条科表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入需要添加的科名:");
                String familyName = scanner.nextLine();
                Family check1 = DaoImpl.classificationDao.getFamilyByFamilyName(familyName);
                if (check1==null)
                {
                    DaoImpl.classificationDao.insertFamily(familyName);
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该科名已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的科名:");
                String name = scanner.nextLine();
                Family check2 = DaoImpl.classificationDao.getFamilyByFamilyName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该科名不存在");
                }else {

                    DaoImpl.classificationDao.deleteFamilyByName(name);
                    System.out.print("删除成功！\n");
                }
                break;
            case 3:
                System.out.print("请输入想要更新的科名: ");
                String oldName = scanner.nextLine();
                Family check3 = DaoImpl.classificationDao.getFamilyByFamilyName(oldName);
                if (check3==null)
                {
                    System.out.println("更新失败！该科名不存在");
                }else {
                    System.out.print("请输入新的科名: ");
                    String newName = scanner.nextLine();
                    DaoImpl.classificationDao.updateFamilyNameByName(oldName,newName);
                    System.out.print("更新成功！\n");
                    break;
                }
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void GenusController(){
        System.out.println("请选择操作：1.插入一条属表信息 2.删除一条属表信息 3.更新一条属表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入新的属名: ");
                String genusName = scanner.nextLine();
                Genus check1 = DaoImpl.classificationDao.getGenusByGenusName(genusName);
                if (check1==null)
                {
                    System.out.print("请输入其所属的科名: ");
                    String familyName = scanner.nextLine();
                    Integer familyId = DaoImpl.classificationDao.getFamilyIdByFamilyName(familyName);
                    DaoImpl.classificationDao.insertGenus(genusName,familyId);
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该属名已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的属名: ");
                String name = scanner.nextLine();
                Genus check2 = DaoImpl.classificationDao.getGenusByGenusName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该属名不存在");
                }else {
                    DaoImpl.classificationDao.deleteGenusByName(name);
                    System.out.print("删除成功！\n");
                }
                break;
            case 3:
                System.out.print("请输入想要更新的属名: ");
                String oldName = scanner.nextLine();
                Genus check3 = DaoImpl.classificationDao.getGenusByGenusName(oldName);
                if (check3==null)
                {
                    System.out.println("更新失败！该属名不存在");
                }else {
                    System.out.print("请输入新的属名: ");
                    String newName = scanner.nextLine();
                    DaoImpl.classificationDao.updateGenusNameByName(oldName,newName);
                    System.out.print("更新成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void SpeciesController(){
        System.out.println("请选择操作：1.插入一条种表信息 2.删除一条种表信息 3.更新一条种表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入新的种名: ");
                String speciesName = scanner.nextLine();
                Species check1 = DaoImpl.classificationDao.getSpeciesBySpeciesName(speciesName);
                if (check1==null)
                {
                    System.out.print("请输入其所属的属名: ");
                    String genusName = scanner.nextLine();
                    Integer genusId = DaoImpl.classificationDao.getGenusIdByGenusName(genusName);
                    System.out.print("请输入该种名的别名: ");
                    String speciesNickname = scanner.nextLine();
                    System.out.print("请输入该种名的形态特征: ");
                    String speciesFeature = scanner.nextLine();
                    System.out.print("请输入该种名的培养技术要点: ");
                    String speciesCultivating = scanner.nextLine();
                    System.out.print("请输入该种名的应用价值: ");
                    String speciesValue = scanner.nextLine();
                    DaoImpl.classificationDao.insertSpecies(speciesName,speciesNickname,speciesFeature,
                            speciesCultivating,speciesValue,genusId);
                    List<Environment> environments=DaoImpl.classificationDao.listEnvironment();
                    for (int i=1;i<=environments.size();i++)
                    {
                        System.out.print(i);
                        System.out.print(". ");
                        System.out.print(environments.get(i).getEnvironmentName());
                        System.out.println();
                    }

                    Integer speciesId=DaoImpl.classificationDao.getSpeciesIdBySpeciesName(speciesName);
                    System.out.print("请选择该种所处的生长环境（输入序号）: ");
                    int choose1=scanner.nextInt();
                    if (choose1<=environments.size())
                    {
                        Integer environmentId = choose1;

                        DaoImpl.classificationDao.insertSpeciesEnvironment(speciesId,environmentId);
                    }

                    List<Distribution> distributions=DaoImpl.classificationDao.listDistributions();
                    for (int i=1;i<=distributions.size();i++)
                    {
                        System.out.print(i);
                        System.out.print(". ");
                        System.out.print(distributions.get(i).getDistributionProvincial());
                        System.out.println();
                    }
                    System.out.print("请选择该种所处的分布区域（输入序号）: ");
                    int choose2=scanner.nextInt();
                    if (choose2<=distributions.size())
                    {
                        Integer distributionId = choose2;
                        DaoImpl.classificationDao.insertSpeciesDistribution(speciesId,distributionId);
                    }
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该种名已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的种名: ");
                String name = scanner.nextLine();
                Species check2 = DaoImpl.classificationDao.getSpeciesBySpeciesName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该种名不存在！");
                }else {
                    Integer SpeciesId = check2.getSpeciesId().intValue();
                    DaoImpl.classificationDao.deleteSpeciesDistribution(SpeciesId);
                    DaoImpl.classificationDao.deleteSpeciesEnvironment(SpeciesId);
                    DaoImpl.classificationDao.deleteSpeciesByName(name);
                    System.out.print("删除成功！\n");
                }
                break;
            case 3:
                System.out.print("请输入想要更新的种名: ");
                String oldName = scanner.nextLine();
                Family check3 = DaoImpl.classificationDao.getFamilyByFamilyName(oldName);
                if (check3==null)
                {
                    System.out.println("更新失败！该种名不存在");
                }else {
                    System.out.print("请输入新的种名: ");
                    String newName = scanner.nextLine();
                    DaoImpl.classificationDao.updateSpeciesNameByName(oldName,newName);
                    System.out.print("更新成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void DistributionController(){
        System.out.println("请选择操作：1.插入一条分布区域信息 2.删除一条分布区域信息 3.更新一条分布区域信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入新的分布区域名称: ");
                String distributionName = scanner.nextLine();
                DaoImpl.classificationDao.insertDistribution(distributionName);
                System.out.print("插入成功！\n");
                break;
            case 2:
                System.out.print("请输入想要删除的分布区域名称: ");
                String name = scanner.nextLine();
                DaoImpl.classificationDao.deleteDistributionByProvincial(name);
                System.out.print("删除成功！\n");
                break;
            case 3:
                System.out.print("请输入想要更新的分布区域名称: ");
                String oldName = scanner.nextLine();
                System.out.print("请输入新的分布区域名称: ");
                String newName = scanner.nextLine();
                DaoImpl.classificationDao.updateDistributionNameByName(oldName,newName);
                System.out.print("更新成功！\n");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void EnvironmentController(){
        System.out.println("请选择操作：1.插入一条生长环境信息 2.删除一条生长环境信息 3.更新一条生长环境信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入新的生长环境名称: ");
                String environmentName = scanner.nextLine();
                DaoImpl.classificationDao.insertEnvironment(environmentName);
                System.out.print("插入成功！\n");
                break;
            case 2:
                System.out.print("请输入想要删除的生长环境名称: ");
                String name = scanner.nextLine();
                DaoImpl.classificationDao.deleteEnvironmentByName(name);
                System.out.print("删除成功！\n");
                break;
            case 3:
                System.out.print("请输入想要更新的生长环境名称: ");
                String oldName = scanner.nextLine();
                System.out.print("请输入新的生长环境名称: ");
                String newName = scanner.nextLine();
                DaoImpl.classificationDao.updateEnvironmentNameByName(oldName,newName);
                System.out.print("更新成功！\n");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void GrowthController(){
        System.out.println("请选择操作：1.插入一条周期信息 2.删除一条生长周期信息 3.更新一条生长周期信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入新的生长周期名称: ");
                String growthName = scanner.nextLine();
                DaoImpl.classificationDao.insertGrowth(growthName);
                System.out.print("插入成功！\n");
                break;
            case 2:
                System.out.print("请输入想要删除的生长周期名称: ");
                String name = scanner.nextLine();
                DaoImpl.classificationDao.deleteGrowthByName(name);
                System.out.print("删除成功！\n");
                break;
            case 3:
                System.out.print("请输入想要更新的生长周期名称: ");
                String oldName = scanner.nextLine();
                System.out.print("请输入新的生长周期名称: ");
                String newName = scanner.nextLine();
                DaoImpl.classificationDao.updateGrowthNameByName(oldName,newName);
                System.out.print("更新成功！\n");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void DeviceController(){
        System.out.println("请选择操作：1.插入一条设备表信息 2.删除一条设备表信息 3.更新一条设备表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入需要添加的设备名称:");
                String deviceName = scanner.nextLine();
                Device check1 = DaoImpl.deviceDAO.getDeviceByDevName(deviceName);
                if (check1==null)
                {
                    System.out.print("是否可以监测茎杆生长,0不能1能:");
                    String devCanMonitorStemGrowth = scanner.nextLine();
                    System.out.print("是否可以监测果实生长,0不能1能:");
                    String devCanMonitorFruitGrowth = scanner.nextLine();
                    System.out.print("是否可以监测冠层温度,0不能1能:");
                    String devCanMonitorCanopyTemperature = scanner.nextLine();
                    System.out.print("是否可以监测叶面温度,0不能1能:");
                    String devCanMonitorLeafTemperature = scanner.nextLine();
                    DaoImpl.deviceDAO.insertDevice1(deviceName,devCanMonitorStemGrowth,devCanMonitorFruitGrowth,
                            devCanMonitorCanopyTemperature,devCanMonitorLeafTemperature);
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该设备已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的设备:");
                String name = scanner.nextLine();
                Device check2 = DaoImpl.deviceDAO.getDeviceByDevName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该设备不存在");
                }else {

                    DaoImpl.deviceDAO.deleteDeviceByName(name);
                    System.out.print("删除成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void MonitoringRecordController(){
        System.out.println("请选择操作：1.插入一条设备记录信息 2.删除一条设备记录信息 3.更新一条设备记录信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入需要添加的设备记录:");
                String deviceName = scanner.nextLine();
                Device check1 = DaoImpl.deviceDAO.getDeviceByDevName(deviceName);
                if (check1==null)
                {
                    System.out.print("请输入监测植物对象号:");
                    String devCanMonitorStemGrowth = scanner.nextLine();
                    System.out.print("请输入监测人员ID:");
                    String devCanMonitorFruitGrowth = scanner.nextLine();
                    System.out.print("是否可以监测冠层温度,0不能1能:");
                    String devCanMonitorCanopyTemperature = scanner.nextLine();
                    System.out.print("是否可以监测叶面温度,0不能1能:");
                    String devCanMonitorLeafTemperature = scanner.nextLine();
                    DaoImpl.deviceDAO.insertDevice1(deviceName,devCanMonitorStemGrowth,devCanMonitorFruitGrowth,
                            devCanMonitorCanopyTemperature,devCanMonitorLeafTemperature);
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该设备已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的设备:");
                String name = scanner.nextLine();
                Device check2 = DaoImpl.deviceDAO.getDeviceByDevName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该设备不存在");
                }else {

                    DaoImpl.deviceDAO.deleteDeviceByName(name);
                    System.out.print("删除成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void DiseaseController(){
        System.out.println("请选择操作：1.插入一条病虫害表信息 2.删除一条病虫害表信息 3.更新一条病虫害表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                userSharingController.InsertDisease();
                break;
            case 2:
                userSharingController.DeleteConserveTask();
                break;
            case 3:
                userSharingController.UpdateDisease();
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void MethodController(){
        System.out.println("请选择操作：1.插入一条防治方法表信息 2.删除一条防治方法表信息 3.更新一条防治方法表信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入需要添加的防治方法名称:");
                String methodName = scanner.nextLine();
                System.out.print("请输入药剂名称:");
                String drugName = scanner.nextLine();
                System.out.print("请输入药剂用量:");
                String drugDosage = scanner.nextLine();
                System.out.print("请输入作用期限:");
                String drugTime = scanner.nextLine();
                Method check1 = DaoImpl.methodDao.getMethodByName(methodName);
                if (check1==null)
                {
                    DaoImpl.methodDao.insertMethod1(methodName,drugName,Double.parseDouble(drugDosage),Double.parseDouble(drugTime));
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该防治方法已录入过");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的防治方法名称:");
                String name = scanner.nextLine();
                Method check2 = DaoImpl.methodDao.getMethodByName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该防治方法不存在");
                }else {
                    DaoImpl.methodDao.deleteMethod(check2.getMethod_id());
                    System.out.print("删除成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
    public void insertPlant() {
        //录入植物信息
        System.out.println("请输入新植物的所属的种的种名：");
        PlantDao plantdao= SqlSessionUtils.getSqlSession().getMapper(PlantDao.class);
        Scanner scanner=new Scanner(System.in);
        String speciesName=scanner.nextLine();
        Species speciesBySpeciesName = DaoImpl.classificationDao.getSpeciesBySpeciesName( speciesName);
        if (speciesBySpeciesName==null)
        {
            System.out.println("植物种名不存在");
        }else{
            System.out.println("请输入植物标识名称");
            String plantname=scanner.nextLine();
            System.out.println("请选择该植物所处的生长周期");
            List<Growth> growths= DaoImpl.classificationDao.listGrowth();

            for (int i=1;i<=growths.size();i++)
            {
                System.out.print(i);
                System.out.print(". ");
                System.out.print(growths.get(i).getGrowthName());
                System.out.println();
            }
            int choose=scanner.nextInt();
            if (choose<=growths.size())
            {
                Plant plant=new Plant();
                plant.setPlantName(plantname);
                int sid=speciesBySpeciesName.getSpeciesId().intValue();
                plant.setSpeciesId( sid);
                plant.setGrowthId(growths.get(choose).getGrowthId().intValue());
                plant.setPlaceId(3);
                plantdao.insertPlant(plant);
            }

        }

    }
    public void UserController(){
        System.out.println("请选择操作：1.插入一条用户信息 2.删除一条用户信息 3.更新一条用户信息");
        Scanner scanner=new Scanner(System.in);
        int choose=scanner.nextInt();
        scanner.nextLine();
        switch (choose){
            case 1:
                System.out.print("请输入需要添加的用户名称:");
                String userName = scanner.nextLine();
                User check1 = DaoImpl.userDAO.getUserByName(userName);
                if (check1==null)
                {
                    System.out.print("请输入需要添加的用户密码:");
                    String userPassword = scanner.nextLine();
                    System.out.print("请输入电话号码，要求大于4位:");
                    String userPhoneNum = scanner.nextLine();
                    System.out.print("请输入用户年龄，要求大于0:");
                    String userAge = scanner.nextLine();
                    System.out.print("请输入用户性别，为“男”或“女”:");
                    String userSex = scanner.nextLine();
                    if(userSex.equals("男")){
                        userSex = String.valueOf(0);
                    }else if(userSex.equals("女")){
                        userSex = String.valueOf(1);
                    }else {
                        System.out.println("输入错误");
                        return;
                    }
                    List<Role> roles=DaoImpl.roleDAO.listRoles();
                    for (int i=1;i<=roles.size();i++)
                    {
                        System.out.print(i);
                        System.out.print(". ");
                        System.out.print(roles.get(i).getRoleName());
                        System.out.println();
                    }
                    int choose2=scanner.nextInt();
                    if (choose2<=roles.size()){
                        Integer roleId=choose2;
                        DaoImpl.userDAO.insertUser(userName,userPassword,userPhoneNum,Integer.parseInt(userAge),userSex,roleId);
                    }
                    System.out.print("插入成功！\n");
                }else {
                    System.out.println("该用户已存在");
                }
                break;
            case 2:
                System.out.print("请输入想要删除的用户名称：");
                String name = scanner.nextLine();
                User check2 = DaoImpl.userDAO.getUserByName(name);
                if (check2==null)
                {
                    System.out.println("删除失败！该用户不存在");
                }else {
                    DaoImpl.userDAO.deleteUserByName(check2.getUserName());
                    System.out.print("删除成功！\n");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
