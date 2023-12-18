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
    public User selectUserByName(String name);


    /**
     * 增加
     */

    /**
     * 修改
     */


    /**
     * 删除
     */

}
