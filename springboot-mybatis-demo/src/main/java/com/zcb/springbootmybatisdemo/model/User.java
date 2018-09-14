package com.zcb.springbootmybatisdemo.model;


import org.springframework.stereotype.Component;

import java.io.Serializable;

public class User implements Serializable {
    /** id **/
    private Long id;

    /** 用户昵称 **/
    private String nickName;

    /** 用户账号 **/
    private String account;

    /** 用户密码 **/
    private String password;

    /** 电话号码 **/
    private String tel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
