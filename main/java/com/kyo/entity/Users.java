package com.kyo.entity;

import java.util.Date;

public class Users {

    private Integer id;                 // 用户编号
    // private String username;            // 登录账号
    private String name;                // 登录账号
    private String userpass;            // 登录密码
    private String nickname;            // 用户昵称
    private Integer age;                // 用户年龄
    private String gender;              // 用户性别
    private String email;               // 用户邮箱
    private String phone;               // 联系方式
    private Date createTime;            // 创建时间
    private Date updateTime;            // 账号最后修改时间
    private Date lastLogin;             // 用户最后登录时间
    private Integer userStatus;         // 用户账号状态 0 正常 1 锁定 2 删除
    private String remark;              // 用户备注信息
        // 用户地址信息【地址列表，有一个是默认地址】

    public Users() {
    }

    public Users(Integer id) {
        this.id = id;
    }

    public Users(String name, String userpass, String nickname, Integer age, String gender, String email, String phone) {
        this.name = name;
        this.userpass = userpass;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;

    }

    public Users(Integer id, String nickname, Integer age, String gender, String email, String phone, Date updateTime, String remark) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public Users(String name, String userpass, String nickname, Integer age, String gender, String email, String phone, Date createTime, Date updateTime, Date lastLogin, Integer userStatus) {
        this.name = name;
        this.userpass = userpass;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastLogin = lastLogin;
        this.userStatus = userStatus;
    }

    public Users(Integer id, String nickname, Integer age, String gender, String email, String phone, String remark) {
        this.id = id;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.remark = remark;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /*public String getUsername() {
		return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }




    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userpass='" + userpass + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", lastLogin=" + lastLogin +
                ", userStatus=" + userStatus +
                ", remark='" + remark + '\'' +

                '}';
    }
}