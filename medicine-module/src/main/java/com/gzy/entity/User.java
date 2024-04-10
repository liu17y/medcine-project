package com.gzy.entity;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2023-11-25 12:13:47
 */

public class User implements Serializable {
    private static final long serialVersionUID = 409896373601026057L;
    private Integer id;

    private String name;

    private String username;

    private String imageUrl;

    private int sex;

    transient private String password;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 许可证或执照号码
     */
    private String license;
    /**
     * 处方记录
     */
    private String prescriptionRecords;
    /**
     * 医疗历史
     */
    private String medicalHistory;
    /**
     * 角色
     */
    private Integer roleId;
    /**
     * 0表示删除/1表示存在
     */
    private Integer isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getPrescriptionRecords() {
        return prescriptionRecords;
    }

    public void setPrescriptionRecords(String prescriptionRecords) {
        this.prescriptionRecords = prescriptionRecords;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}

