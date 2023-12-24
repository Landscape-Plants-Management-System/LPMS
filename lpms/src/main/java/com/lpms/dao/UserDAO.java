package com.lpms.dao;

import com.lpms.pojo.Role;
import com.lpms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDAO {
    /**
     * 查询
     */
    //根据用户名查询用户
    User getUserByName(@Param("userName") String userName);

    User getUserById(int userId);
    User getMonUserById(@Param("monUserId")int monUserId);
    List<User> getMonUserByRoleId(@Param("roleId")int roleId);
    /**
     * 增加
     */
    void insertUser(@Param("userName")String userName, @Param("userPassword")String userPassword,
                    @Param("userPhoneNum")String userPhoneNum, @Param("userAge")Integer userAge,
                    @Param("userSex")String userSex, @Param("roleId")Integer roleId);
    /**
     * 修改
     */
    void updateUser(User user);

    /**
     * 删除
     */
    void deleteUserByName(@Param("userName")String userName);
}
