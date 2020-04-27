package com.apps.andhika.com.apps.andhika.latihansharedpreference.model;

/*
    Developed by Andhika Putra Bagaskara - 10117167 - IF5
    on 27-04-2020
 */

public class UserModel {
    private String username;
    private String password;
    private String phone;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
}
