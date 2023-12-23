package com.lpms.dao;

import com.lpms.pojo.disease.Method;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MethodDao {
    //按ID查询
    Method getMethodById(int methodId);
    //获取所有防治方法
    List<Method> getAllMethods();
    //按防治方法名查询
    Method getMethodByName(String methodName);
    //插入防治方法表
    int insertMethod(Method method);
    int insertMethod1(@Param("methodName")String methodName,@Param("drugName")String drugName,
                      @Param("drugDosage")double drugDosage, @Param("drugTime")double drugTime);
    //更新防治方法表
    int updateMethod(Method method);
    //删除防治方法表
    void deleteMethod(int methodId);
}
