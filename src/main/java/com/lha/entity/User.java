package com.lha.entity;


/**
 * @Desrciption
 * @Author Lu.Hongan
 * @Date Created on 2017-12-09 23:03
 */
public class User {
    private String userName;

    private String password;

    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
