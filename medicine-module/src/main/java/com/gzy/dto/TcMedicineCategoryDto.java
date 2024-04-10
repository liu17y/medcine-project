package com.gzy.dto;

public class TcMedicineCategoryDto {
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
    private Integer isdelete;
    private String category;
    private String skuid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public String getSkuid() {
        return skuid;
    }

    public void setSkuid(String skuid) {
        this.skuid = skuid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMedicinalPart() {
        return medicinalPart;
    }

    public void setMedicinalPart(String medicinalPart) {
        this.medicinalPart = medicinalPart;
    }

    public String getClinicalApplication() {
        return clinicalApplication;
    }

    public void setClinicalApplication(String clinicalApplication) {
        this.clinicalApplication = clinicalApplication;
    }

    public String getPharmacologicalResearch() {
        return pharmacologicalResearch;
    }

    public void setPharmacologicalResearch(String pharmacologicalResearch) {
        this.pharmacologicalResearch = pharmacologicalResearch;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getCompatibilityRescription() {
        return compatibilityRescription;
    }

    public void setCompatibilityRescription(String compatibilityRescription) {
        this.compatibilityRescription = compatibilityRescription;
    }

    public String getEfficacyEffects() {
        return efficacyEffects;
    }

    public void setEfficacyEffects(String efficacyEffects) {
        this.efficacyEffects = efficacyEffects;
    }

    public String getPlantMorphology() {
        return plantMorphology;
    }

    public void setPlantMorphology(String plantMorphology) {
        this.plantMorphology = plantMorphology;
    }

    public String getHarvestingProcessing() {
        return harvestingProcessing;
    }

    public void setHarvestingProcessing(String harvestingProcessing) {
        this.harvestingProcessing = harvestingProcessing;
    }

    public String getMeridianTaste() {
        return meridianTaste;
    }

    public void setMeridianTaste(String meridianTaste) {
        this.meridianTaste = meridianTaste;
    }

    public String getOriginDistribution() {
        return originDistribution;
    }

    public void setOriginDistribution(String originDistribution) {
        this.originDistribution = originDistribution;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
