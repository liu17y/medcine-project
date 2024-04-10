package com.liu.search.search.elasticsearch;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.*;

import javax.persistence.Id;

@Data
@Document(indexName = "integrated_medicine_info")
public class IntegratedMedicineInfo {

    @Id
    private String id;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_smart"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword"),
    })
    private String name;

    private String imageUrl;

    // 共有的字段
    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String usageDosage;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String taboo;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String adverseReaction;

    private String isdelete;

    //@Field(name = "no", type = FieldType.Keyword)
    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_smart"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword"),
    })
    private String skuId;

    // 独有字段
    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String componentName;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String alias;

    // 共有的字段
    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String specification;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String category;

    //@Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String character;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String mainEffect;

    @Field(type = FieldType.Keyword)
    private String malady;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String clinicalPractice;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String note;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String untowardReaction;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String drugInteractions;

    @Field(type = FieldType.Keyword)
    private String drugInteraction;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String lookOut;


    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String carriedTandard;

    @Field(type = FieldType.Text)
    private String storageMethods;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String expirationDate;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String medicinalPart;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String clinicalApplication;

    @Field(type = FieldType.Text)
    private String pharmacologicalResearch;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String contraindications;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String compatibilityRescription;

    @MultiField(mainField = @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word"),otherFields = {
            @InnerField(type = FieldType.Keyword,suffix = "keyword")
    })
    private String efficacyEffects;

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String plantMorphology;

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_max_word")
    private String harvestingProcessing;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String meridianTaste;

    @MultiField(mainField = @Field(type = FieldType.Text, analyzer = "ik_max_word", searchAnalyzer = "ik_smart"), otherFields = {
            @InnerField(type = FieldType.Keyword, suffix = "keyword") })
    private String originDistribution;

}