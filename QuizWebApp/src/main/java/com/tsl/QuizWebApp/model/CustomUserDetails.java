package com.tsl.QuizWebApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "USER_DETAILS")
public class CustomUserDetails {
    @Id
    private int id;
    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    private String MOBILE_NO;
    private String EMAIL_ID;
    private String F_NAME;
    private String LOGIN_ALLOWED;
    private String USER_TYPE;
    private Date PWD_RESET_DATE;
    private Date PWD_EXP_DATE;
    private String DEL_FLG;
    private String L_NAME;
    private String GENDER;

    public Date getPWD_RESET_DATE() {
        return PWD_RESET_DATE;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMOBILE_NO() {
        return MOBILE_NO;
    }

    public String getEMAIL_ID() {
        return EMAIL_ID;
    }

    public String getF_NAME() {
        return F_NAME;
    }

    public String getLOGIN_ALLOWED() {
        return LOGIN_ALLOWED;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public Date getPWD_EXP_DATE() {
        return PWD_EXP_DATE;
    }

    public String getDEL_FLG() {
        return DEL_FLG;
    }

    public String getL_NAME() {
        return L_NAME;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMOBILE_NO(String MOBILE_NO) {
        this.MOBILE_NO = MOBILE_NO;
    }

    public void setEMAIL_ID(String EMAIL_ID) {
        this.EMAIL_ID = EMAIL_ID;
    }

    public void setF_NAME(String f_NAME) {
        F_NAME = f_NAME;
    }

    public void setLOGIN_ALLOWED(String LOGIN_ALLOWED) {
        this.LOGIN_ALLOWED = LOGIN_ALLOWED;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public void setPWD_RESET_DATE(Date PWD_RESET_DATE) {
        this.PWD_RESET_DATE = PWD_RESET_DATE;
    }

    public void setPWD_EXP_DATE(Date PWD_EXP_DATE) {
        this.PWD_EXP_DATE = PWD_EXP_DATE;
    }

    public void setDEL_FLG(String DEL_FLG) {
        this.DEL_FLG = DEL_FLG;
    }

    public void setL_NAME(String l_NAME) {
        L_NAME = l_NAME;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    @Override
    public String toString() {
        return "CustomUserDetails{" +
                "id=" + id +
                ", USER_NAME='" + username + '\'' +
                ", PASSWORD='" + password + '\'' +
                ", MOBILE_NO='" + MOBILE_NO + '\'' +
                ", EMAIL_ID='" + EMAIL_ID + '\'' +
                ", F_NAME='" + F_NAME + '\'' +
                ", LOGIN_ALLOWED='" + LOGIN_ALLOWED + '\'' +
                ", USER_TYPE='" + USER_TYPE + '\'' +
                ", PWD_RESET_DATE=" + PWD_RESET_DATE +
                ", PWD_EXP_DATE=" + PWD_EXP_DATE +
                ", DEL_FLG='" + DEL_FLG + '\'' +
                ", L_NAME='" + L_NAME + '\'' +
                ", GENDER='" + GENDER + '\'' +
                '}';
    }
}


