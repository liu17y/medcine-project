package com.gzy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (ChinesePatentDrug)实体类
 *
 * @author makejava
 * @since 2024-03-16 14:37:37
 */
@Data
public class ChinesePatentDrug implements Serializable {
    private static final long serialVersionUID = -62763357891181175L;

    private String id;
    /**
     * 药名
     */
    private String componentName;
    /**
     * 图片
     */
    private String imageurl;
    /**
     * 成分
     */
    private String character;
    /**
     * 性状
     */
    private String mainEffect;
    /**
     * 主要功效
     */
    private String malady;
    /**
     * 临床应用及指南
     */
    private String clinicalPractice;
    /**
     * 规格
     */
    private String specifications;
    /**
     * 用法用量
     */
    private String usageDosage;
    /**
     * 注意事项
     */
    private String note;
    /**
     * 不良反应
     */
    private String untowardReaction;
    /**
     * 禁忌
     */
    private String taboo;
    /**
     * 药物相互作用
     */
    private String drugInteractions;
    /**
     * 执行标准
     */
    private String carriedTandard;
    /**
     * 贮藏方法
     */
    private String storageMethods;
    /**
     * 有效期
     */
    private String expirationDate;
    private String skuId;
    private String isdelete;

}

