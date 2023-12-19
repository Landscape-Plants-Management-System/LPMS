package com.lpms.dao;

import com.lpms.pojo.disease.Method;

import java.util.List;

public interface MethodDao {
    //按ID查询
    Method getMethodById(int methodId);
    //获取所有防治方法
    List<Method> getAllMethods();
    //按防治方法名查询
    Method getMethodByName(String methodName);
    //插入防治方法表
    void insertMethod(Method method);
    //更新防治方法表
    void updateMethod(Method method);
    //删除防治方法表
    void deleteMethod(int methodId);
}
