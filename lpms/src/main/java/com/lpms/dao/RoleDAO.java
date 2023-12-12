package com.lpms.dao;

import com.lpms.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDAO {
    /**
     * 查询
     */
    List<Role> listRoles();
    Role getRoleById(@Param("roleId")Integer roleId);
    List<Role> listRolesByName(@Param("roleName")String roleName);
    List<Role> listRolesBySysPrivilege();
    /**
     * 增加
     */
    void insertRole(Role role);

    /**
     * 修改
     */
    void updateRole(Role role);


    /**
     * 删除
     */
    void deleteRoleById(@Param("roleId")Integer roleId);
    void deleteRoleByName(@Param("roleName")String roleName);
}
