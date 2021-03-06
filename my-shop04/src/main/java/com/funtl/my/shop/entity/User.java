package com.funtl.my.shop.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 用户
 */
//序列化网络接口
@Component
public class User implements Serializable {
    private  String username;
    private  String password;
    private  String email;
    //记住我
    private  boolean isRemember;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRemember() {

        return isRemember;
    }

    public void setRemember(boolean remember) {
        isRemember = remember;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
