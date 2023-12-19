package com.lpms.dao;

import com.lpms.pojo.disease.Disease;
import java.util.List;

public interface DiseaseDao {
    //按ID查询
    Disease getDiseaseById(int diseaseId);
    //获取所有病虫害信息
    List<Disease> getAllDiseases();
    //按病虫害名查询
    Disease getDiseaseByName(String diseaseName);
    //插入病虫害表
    void insertDisease(Disease disease);
    //更新病虫害表
    void updateDisease(Disease disease);
    //删除病虫害表
    void deleteDisease(int diseaseId);

}
