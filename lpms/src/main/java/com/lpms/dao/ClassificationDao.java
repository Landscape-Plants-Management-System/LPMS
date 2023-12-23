package com.lpms.dao;

import com.lpms.pojo.classification.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//Family、Genus、Species、Distribution、Environment、Growth 六表操作集合
public interface ClassificationDao {
    /**
     * 基础查询，实现对园林植物分类信息的查询
     */
    //科
    List<Family> listFamilies();
    //Family getFamilyByFamilyId(@Param("family_id")Integer family_id);
    Integer getFamilyIdByFamilyName(@Param("family_name")String family_name);
    Family getFamilyByFamilyName(@Param("family_name")String family_name);

    //属
    List<Genus> listGenuses();
    //Genus getGenusByGenusId(@Param("genus_id")Integer genus_id);
    Integer getGenusIdByGenusName(@Param("genus_name")String genus_name);
    Genus getGenusByGenusName(@Param("genus_name")String genus_name);

    //种
    List<Species> listSpecies();
    //Species getSpeciesBySpeciesId(@Param("species_id")Integer species_id);
    Integer getSpeciesIdBySpeciesName(@Param("species_name")String species_name);
    Species getSpeciesBySpeciesName(@Param("species_name")String species_name);

    //分布区域
    List<Distribution> listDistributions();
    //Distribution getFamilyByDistributionId(@Param("distribution_id")Integer distribution_id);
    Distribution getFamilyByDistributionName(@Param("distribution_provincial")String distribution_provincial);

    //生长环境
    List<Environment> listEnvironment();
    //Environment getEnvironmentByEnvironmentId(@Param("environment_id")Integer environment_id);
    List<Environment> getEnvironmentByEnvironmentName(@Param("environment_name")String environment_name);

    //生长阶段
    List<Growth> listGrowth();
    //Growth getGrowthByGrowthId(@Param("growth_id")Integer growth_id);
    Growth getGrowthByGrowthName(@Param("growth_name")String growth_name);

    /**
     * 增加，实现对园林植物分类信息的增加
     */
    void insertFamily(String familyName);
    void insertGenus(@Param("genusName")String genusName,@Param("familyId")Integer familyId);
    void insertSpecies(@Param("speciesName")String speciesName,@Param("speciesNickname")String speciesNickname,
                       @Param("speciesFeature")String speciesFeature, @Param("speciesCultivating")String speciesCultivating,
                       @Param("speciesValue")String speciesValue,@Param("genusId")Integer genusId);
    void insertDistribution(@Param("distributionName")String distributionName);
    void insertEnvironment(@Param("environmentName")String  environmentName);
    void insertGrowth(@Param("growthName")String growthName);
    //插入外键表
    void insertSpeciesDistribution(@Param("speciesId")Integer speciesId,@Param("distributionId")Integer distributionId);
    void insertSpeciesEnvironment(@Param("speciesId")Integer speciesId,@Param("environmentId")Integer environmentId);

    /**
     * 删除，实现对园林植物分类信息的删除
     */
    //科
    //void deleteFamilyById(@Param("family_id")Integer family_id);
    void deleteFamilyByName(@Param("family_name")String family_name);

    //属
    //void deleteGenusById(@Param("genus_id")Integer genus_id);
    void deleteGenusByName(@Param("genus_name")String genus_name);

    //种
    //void deleteSpeciesById(@Param("species_id")Integer species_id);
    void deleteSpeciesByName(@Param("species_name")String species_name);

    //分布区域
    //void deleteDistributionById(@Param("distribution_id")Integer distribution_id);
    void deleteDistributionByProvincial(@Param("distribution_provincial")String distribution_provincial);

    //生长环境
    //void deleteEnvironmentById(@Param("environment_id")Integer environment_id);
    void deleteEnvironmentByName(@Param("environment_name")String environment_name);

    //生长周期
    //void deleteGrowthById(@Param("growth_id")Integer growth_id);
    void deleteGrowthByName(@Param("growth_name")String growth_name);

    //删除外键表内容
    void deleteSpeciesDistribution(@Param("speciesId")Integer speciesId);
    void deleteSpeciesEnvironment(@Param("speciesId")Integer speciesId);


    /**
     * 修改，实现对园林植物分类信息的修改
     */
    void updateFamilyNameById(Family family);
    void updateFamilyNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    void updateGenusNameById(Genus genus);
    void updateGenusNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    void updateSpeciesById(Species species);
    void updateSpeciesNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    void updateDistributionById(Distribution distribution);
    void updateDistributionNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    void updateEnvironmentNameById(Environment environment);
    void updateEnvironmentNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    void updateGrowthById(Growth growth);
    void updateGrowthNameByName(@Param("oldName")String oldName,@Param("newName")String newName);

    /**
     * 复杂查询，借助视图，实现对园林植物分类信息的查询
     */
    //查看简易的植物分类信息，也可用于生长环境等所有字段的模糊查询
    List<Simple_Classification_Info> getSimpleClassificationInfo(@Param("keyword") String keyword);

    //查看完整的植物分类信息，返回全部信息
    List<Complete_Classification_Info> getCompleteClassificationInfo();

    //根据科名查找下属的植物情况
    List<Family_Genus_Species_Info> findSubordinatePlantsFamily(@Param("keyword") String keyword);

    //根据属名查找下属的植物情况
    List<Family_Genus_Species_Info> findSubordinatePlantsGenus(@Param("keyword") String keyword);

}
