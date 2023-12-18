package com.lpms.dao;

import com.lpms.pojo.disease.Disease;

import java.util.List;

public interface DiseaseDao {
    int addMethod(Disease disease);
    int addDisease(Disease disease);
    void deleteDisease(int id);
    void updateMethod(Disease disease);
    void updateDisease(Disease disease);
    List<Disease> findAll();
}
