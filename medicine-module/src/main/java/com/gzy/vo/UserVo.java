package com.gzy.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {

    private Integer id;

    private String name;

    private String username;

    private String imageUrl;

    private Integer sex;

    private Integer roleId;

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

    private Integer is_delete;
}
