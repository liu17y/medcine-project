package com.gzy.dto;

import lombok.Data;

@Data
public class WMedicineCategoryDto {
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
    private Integer is_delete;
    private String category;
}
