package com.gzy.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (WMedicine)实体类
 *
 * @author makejava
 * @since 2023-11-08 21:49:08
 */
@Data
public class WMedicine implements Serializable {
    private static final long serialVersionUID = 273110060787274681L;

    private String id;
    /**
     * 名称
     */
    private String name;

    private String imageUrl;
    /**
     * 药物分类
     */
    private String drugClassification;
    /**
     * 成分
     */
    private String ingredient;
    /**
     * 适应症
     */
    private String indication;
    /**
     * 用法用量
     */
    private String usageDosage;
    /**
     * 禁忌
     */
    private String taboo;
    /**
     * 不良反应
     */
    private String adverseReaction;
    /**
     * 注意事项
     */
    private String lookOut;
    /**
     * 药物相互作用
     */
    private String drugInteraction;
    /**
     * ATC编码
     */
    private String atcCode;
    /**
     * 规格/包装
     */
    private String specification;
    private String skuId;
    private String isdelete;


}

