package com.lpms.dao;

import com.lpms.pojo.*;
import com.lpms.pojo.plant.Growth;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//Family、Genus、Species、Distribution、Environment、Growth 六表操作集合
public interface ClassificationDao {
    /**
     * 基础查询，实现对园林植物分类信息的查询
     */
    //科
    List<Family> listFamilies();
    Family getFamilyByFamilyId(@Param("family_id")Integer family_id);
    Family getFamilyByFamilyName(@Param("devName")String family_name);

    //属
    List<Genus> listGenuses();
    Genus getGenusByGenusId(@Param("genus_id")Integer genus_id);
    Genus getGenusByGenusName(@Param("genus_name")String genus_name);

    //种
    List<Species> listSpecies();
    Species getSpeciesBySpeciesId(@Param("species_id")Integer species_id);
    Species getSpeciesBySpeciesName(@Param("species_name")String species_name);

    //分布区域
    List<Distribution> listDistributions();
    Distribution getFamilyByDistributionId(@Param("distribution_id")Integer distribution_id);
    Distribution getFamilyByDistributionName(@Param("distribution_name")String distribution_name);

    //生长环境
    List<Environment> listEnvironment();
    Environment getEnvironmentByEnvironmentId(@Param("environment_id")Integer environment_id);
    Environment getEnvironmentByEnvironmentName(@Param("environment_name")String environment_name);

    //生长阶段
    List<Growth> listGrowth();
    Genus getGrowthByGrowthId(@Param("growth_id")Integer growth_id);
    Genus getGrowthByGrowthName(@Param("growth_name")String growth_name);

    /**
     * 增加，实现对园林植物分类信息的增加
     */
    void insertFamily(Family family);
    void insertGenus(Genus genus);
    void insertSpecies(Species species);
    void insertDistribution(Distribution distribution);
    void insertEnvironment(Environment environment);
    void insertGrowth(Growth growth);

    /**
     * 删除，实现对园林植物分类信息的删除
     */
    //科
    void deleteFamilyById(@Param("family_id")Integer family_id);
    void deleteFamilyByName(@Param("family_name")String family_name);

    //属
    void deleteGenusById(@Param("genus_id")Integer genus_id);
    void deleteGenusByName(@Param("genus_name")String genus_name);

    //种
    void deleteSpeciesById(@Param("species_id")Integer species_id);
    void deleteSpeciesByName(@Param("species_name")String species_name);

    //分布区域
    void deleteDistributionById(@Param("distribution_id")Integer distribution_id);
    void deleteDistributionByProvincial(@Param("distribution_provincial")String distribution_provincial);
    void deleteDistributionByCity(@Param("distribution_city")String distribution_city);
    void deleteDistributionByCounty(@Param("distribution_county")String distribution_county);

    //生长环境
    void deleteEnvironmentById(@Param("environment_id")Integer environment_id);
    void deleteEnvironmentByName(@Param("environment_name")String environment_name);

    //生长周期
    void deleteGrowthById(@Param("growth_id")Integer growth_id);
    void deleteGrowthByName(@Param("growth_name")String growth_name);

    /**
     * 修改，实现对园林植物分类信息的修改
     */
    void updateFamilyNameById(Family family);
    void updateGenusNameById(Genus genus);
    void updateSpeciesById(Species species);
    void updateDistributionById(Distribution distribution);
    void updateEnvironmentNameById(Environment environment);
    void updateGrowthById(Growth growth);

    /**
     * 复杂查询，借助视图，实现对园林植物分类信息的查询
     */
    //查看简易的植物分类信息，也可用于生长环境等所有字段的模糊查询
    List<Simple_Classification_Info> getSimpleClassificationInfo(@Param("keyword") String keyword);

    //查看完整的植物分类信息，返回全部信息
    List<Complete_Classification_Info> getCompleteClassificationInfo();

    //根据指定属性查找下属的植物情况
    List<Family_Genus_Species_Info> findSubordinatePlants(@Param("keyword") String keyword);

}
