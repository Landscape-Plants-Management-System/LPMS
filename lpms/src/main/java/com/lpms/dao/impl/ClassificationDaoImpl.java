package com.lpms.dao.impl;

import com.lpms.dao.ClassificationDao;
import com.lpms.pojo.Classification.*;
import com.lpms.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClassificationDaoImpl implements ClassificationDao {
    SqlSession sqlSession = SqlSessionUtils.getSqlSession();
    ClassificationDao classificationDao = sqlSession.getMapper(ClassificationDao.class);
    @Override
    public List<Family> listFamilies() {
        return classificationDao.listFamilies();
    }

    @Override
    public Family getFamilyByFamilyName(String family_name) {
        return classificationDao.getFamilyByFamilyName(family_name);
    }

    @Override
    public List<Genus> listGenuses() {
        return classificationDao.listGenuses();
    }

    @Override
    public Genus getGenusByGenusName(String genus_name) {
        return classificationDao.getGenusByGenusName(genus_name);
    }

    @Override
    public List<Species> listSpecies() {
        return classificationDao.listSpecies();
    }

    @Override
    public Species getSpeciesBySpeciesName(String species_name) {
        return classificationDao.getSpeciesBySpeciesName(species_name);
    }

    @Override
    public List<Distribution> listDistributions() {
        return classificationDao.listDistributions();
    }

    @Override
    public Distribution getFamilyByDistributionName(String distribution_provincial) {
        return classificationDao.getFamilyByDistributionName(distribution_provincial);
    }

    @Override
    public List<Environment> listEnvironment() {
        return classificationDao.listEnvironment();
    }

    @Override
    public List<Environment> getEnvironmentByEnvironmentName(String environment_name) {
        return classificationDao.getEnvironmentByEnvironmentName(environment_name);
    }

    @Override
    public List<Growth> listGrowth() {
        return classificationDao.listGrowth();
    }

    @Override
    public Growth getGrowthByGrowthName(String growth_name) {
        return classificationDao.getGrowthByGrowthName(growth_name);
    }

    @Override
    public void insertFamily(Family family) {
        if(getFamilyByFamilyName(family.getFamilyName())!=null){
            throw new RuntimeException("该分类已存在");
        }
        classificationDao.insertFamily(family);
    }

    @Override
    public void insertGenus(Genus genus) {
        if(getGenusByGenusName(genus.getGenusName())!=null){
            throw new RuntimeException("该属已存在");
        }
        classificationDao.insertGenus(genus);
    }

    @Override
    public void insertSpecies(Species species) {
        classificationDao.insertSpecies(species);
    }

    @Override
    public void insertDistribution(Distribution distribution) {
        if(getFamilyByDistributionName(distribution.getDistributionProvincial())!=null){
            throw new RuntimeException("该分布区域已存在");
        }
        classificationDao.insertDistribution(distribution);
    }

    @Override
    public void insertEnvironment(Environment environment) {
        if(getEnvironmentByEnvironmentName(environment.getEnvironmentName())!=null){
            throw new RuntimeException("该生长环境已存在");
        }
        classificationDao.insertEnvironment(environment);
    }

    @Override
    public void insertGrowth(Growth growth) {
        if(getGrowthByGrowthName(growth.getGrowthName())!=null){
            throw new RuntimeException("该生长阶段已存在");
        }
        classificationDao.insertGrowth(growth);
    }

    @Override
    public void deleteFamilyByName(String family_name) {
        classificationDao.deleteFamilyByName(family_name);
    }

    @Override
    public void deleteGenusByName(String genus_name) {

    }

    @Override
    public void deleteSpeciesByName(String species_name) {
        classificationDao.deleteSpeciesByName(species_name);
    }

    @Override
    public void deleteDistributionByProvincial(String distribution_provincial) {
        classificationDao.deleteDistributionByProvincial(distribution_provincial);
    }

    @Override
    public void deleteEnvironmentByName(String environment_name) {
        classificationDao.deleteEnvironmentByName(environment_name);
    }

    @Override
    public void deleteGrowthByName(String growth_name) {
        classificationDao.deleteGrowthByName(growth_name);
    }

    @Override
    public void updateFamilyNameById(Family family) {
        classificationDao.updateFamilyNameById(family);
    }

    @Override
    public void updateGenusNameById(Genus genus) {
        classificationDao.updateGenusNameById(genus);
    }

    @Override
    public void updateSpeciesById(Species species) {
        classificationDao.updateSpeciesById(species);
    }

    @Override
    public void updateDistributionById(Distribution distribution) {
        classificationDao.updateDistributionById(distribution);
    }

    @Override
    public void updateEnvironmentNameById(Environment environment) {
        classificationDao.updateEnvironmentNameById(environment);
    }

    @Override
    public void updateGrowthById(Growth growth) {
        classificationDao.updateGrowthById(growth);
    }

    @Override
    public List<Simple_Classification_Info> getSimpleClassificationInfo(String keyword) {
        return classificationDao.getSimpleClassificationInfo(keyword);
    }

    @Override
    public List<Complete_Classification_Info> getCompleteClassificationInfo() {
        return classificationDao.getCompleteClassificationInfo();
    }

    @Override
    public List<Family_Genus_Species_Info> findSubordinatePlants(String keyword) {
        return classificationDao.findSubordinatePlants(keyword);
    }
}
