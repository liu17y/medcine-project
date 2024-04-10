package com.gzy.dto;

import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;

/**
 * @ClassName WMedicineExcel
 * @Version 1.0
 */
//@Data
public class WMedicineExcel implements Serializable {
    private static final long serialVersionUID = 273110060787274681L;

    private Integer id;
    /**
     * 名称
     */
    @ExcelProperty("药名")
    private String name;
    @ExcelProperty("图片")
    private String imageUrl;
    /**
     * 药物分类
     */
    @ExcelProperty("药物分类")
    private String category;
    /**
     * 成分
     */
    @ExcelProperty("成分")
    private String ingredient;
    /**
     * 适应症
     */
    @ExcelProperty("适应症")
    private String indication;
    /**
     * 用法用量
     */
    @ExcelProperty("用法用量")
    private String usageDosage;
    /**
     * 禁忌
     */
    @ExcelProperty("禁忌")
    private String taboo;
    /**
     * 不良反应
     */
    @ExcelProperty("不良反应")
    private String adverseReaction;
    /**
     * 注意事项
     */
    @ExcelProperty("注意事项")
    private String lookOut;
    /**
     * 药物相互作用
     */
    @ExcelProperty("药物相互作用")
    private String drugInteraction;
    /**
     * ATC编码
     */
    @ExcelProperty("ATC编码")
    private String atcCode;
    /**
     * 规格/包装
     */
    @ExcelProperty("规格/包装")
    private String specification;

    private Integer is_delete;

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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}

