package com.gzy.vo;

public class WMedicineCategoryVo {
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
    private String isdelete;
    private String category;
    private String skuId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDrugClassification() {
        return drugClassification;
    }

    public void setDrugClassification(String drugClassification) {
        this.drugClassification = drugClassification;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public String getUsageDosage() {
        return usageDosage;
    }

    public void setUsageDosage(String usageDosage) {
        this.usageDosage = usageDosage;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public String getAdverseReaction() {
        return adverseReaction;
    }

    public void setAdverseReaction(String adverseReaction) {
        this.adverseReaction = adverseReaction;
    }

    public String getLookOut() {
        return lookOut;
    }

    public void setLookOut(String lookOut) {
        this.lookOut = lookOut;
    }

    public String getDrugInteraction() {
        return drugInteraction;
    }

    public void setDrugInteraction(String drugInteraction) {
        this.drugInteraction = drugInteraction;
    }

    public String getAtcCode() {
        return atcCode;
    }

    public void setAtcCode(String atcCode) {
        this.atcCode = atcCode;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
