package com.lpms.pojo;

public class User {
    private Integer userId;
    private String userName;
    private String userPhoneNum;
    private Integer userAge;
    private String userSex;
    private Role role;//一对多

    public User() {
    }

    public User(Integer userId, String userName, String userPhoneNum, Integer userAge, String userSex, Role role) {
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNum = userPhoneNum;
        this.userAge = userAge;
        this.userSex = userSex;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhoneNum='" + userPhoneNum + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                ", role=" + role +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
