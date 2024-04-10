package com.liu.search.search.service;

import com.gzy.utils.ResultData;

public interface ChinesePatentDrugInfoService {
    void addAll();

    ResultData medicineList();

    ResultData medicineByID(String id);

    void addAllChine();

    ResultData getInfoClientByElasticSearch(Integer page, Integer size,String name, String alias, String category, String character, String componentName,Integer skuId);

    ResultData medicineBySkuId(String sku_id);

    ResultData searchByQuery(String queryString, Integer page, Integer size);

    void addAllWmedicine();

}
