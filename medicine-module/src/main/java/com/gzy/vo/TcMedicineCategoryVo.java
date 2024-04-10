package com.gzy.vo;

import lombok.Data;

@Data
public class TcMedicineCategoryVo {
    private String id;
    /**
     * 中药名
     */
    private String name;

    private String imageUrl;
    /**
     * 别名
     */
    private String alias;
    /**
     * 药用部位
     */
    private String medicinalPart;
    /**
     * 临床应用
     */
    private String clinicalApplication;
    /**
     * 药理研究
     */
    private String pharmacologicalResearch;
    /**
     * 使用禁忌
     */
    private String contraindications;
    /**
     * 配伍药方
     */
    private String compatibilityRescription;
    /**
     * 功效与作用
     */
    private String efficacyEffects;
    /**
     * 植物形态
     */
    private String plantMorphology;
    /**
     * 采收加工
     */
    private String harvestingProcessing;
    /**
     * 性味归经
     */
    private String meridianTaste;
    /**
     * 产地分布
     */
    private String originDistribution;

    private String skuId;

    private String isdelete;

    private String category;


}
