package com.lpms.pojo;

public class Role {
    private Integer roleId;
    private String roleName;
    private boolean systemPrivilege;

    public Role() {
    }

    public Role(Integer roleId, String roleName, boolean systemPrivilege) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.systemPrivilege = systemPrivilege;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", systemPrivilege=" + systemPrivilege +
                '}';
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isSystemPrivilege() {
        return systemPrivilege;
    }

    public void setSystemPrivilege(boolean systemPrivilege) {
        this.systemPrivilege = systemPrivilege;
    }
}
