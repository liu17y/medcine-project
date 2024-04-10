package com.gzy.entity;

import java.io.Serializable;

/**
 * (TTcmConstitutionIdentification)实体类
 *
 * @author makejava
 * @since 2023-12-04 17:10:06
 */
public class TTcmConstitutionIdentification implements Serializable {
    private static final long serialVersionUID = 600771915961521727L;

    private Integer id;

    private String constitutionName;

    private String constitutionDesc;

    private String suitableFood;

    private String noSuitableFood;

    private String suitableCrowd;

    private String dosing;

    private String efficacy;

    private String chineseMedicineName;

    private Integer is_delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstitutionName() {
        return constitutionName;
    }

    public void setConstitutionName(String constitutionName) {
        this.constitutionName = constitutionName;
    }

    public String getConstitutionDesc() {
        return constitutionDesc;
    }

    public void setConstitutionDesc(String constitutionDesc) {
        this.constitutionDesc = constitutionDesc;
    }

    public String getSuitableFood() {
        return suitableFood;
    }

    public void setSuitableFood(String suitableFood) {
        this.suitableFood = suitableFood;
    }

    public String getNoSuitableFood() {
        return noSuitableFood;
    }

    public void setNoSuitableFood(String noSuitableFood) {
        this.noSuitableFood = noSuitableFood;
    }

    public String getSuitableCrowd() {
        return suitableCrowd;
    }

    public void setSuitableCrowd(String suitableCrowd) {
        this.suitableCrowd = suitableCrowd;
    }

    public String getDosing() {
        return dosing;
    }

    public void setDosing(String dosing) {
        this.dosing = dosing;
    }

    public String getEfficacy() {
        return efficacy;
    }

    public void setEfficacy(String efficacy) {
        this.efficacy = efficacy;
    }

    public String getChineseMedicineName() {
        return chineseMedicineName;
    }

    public void setChineseMedicineName(String chineseMedicineName) {
        this.chineseMedicineName = chineseMedicineName;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "TTcmConstitutionIdentification{" +
                "id=" + id +
                ", constitutionName='" + constitutionName + '\'' +
                ", constitutionDesc='" + constitutionDesc + '\'' +
                ", suitableFood='" + suitableFood + '\'' +
                ", noSuitableFood='" + noSuitableFood + '\'' +
                ", suitableCrowd='" + suitableCrowd + '\'' +
                ", dosing='" + dosing + '\'' +
                ", efficacy='" + efficacy + '\'' +
                ", chineseMedicineName='" + chineseMedicineName + '\'' +
                ", is_delete=" + is_delete +
                '}';
    }
}

