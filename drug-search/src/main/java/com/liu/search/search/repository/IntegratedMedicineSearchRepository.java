package com.liu.search.search.repository;

import com.liu.search.search.elasticsearch.IntegratedMedicineInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IntegratedMedicineSearchRepository extends ElasticsearchRepository<IntegratedMedicineInfo,String> {
    List<IntegratedMedicineInfo> getByNameLikeOrCategoryOrAliasOrComponentNameOrCharacterAndSkuId(String name,String category, String alias, String character, String componentName,Integer skuId);

    //List<IntegratedMedicineInfo> getByNameLikeOrCategoryOrAliasOrNameAndSkuIdLike(String skuId, String name, String alias, String category);
    List<IntegratedMedicineInfo> getByNameLikeAndSkuIdLike(String skuId, String name);

    //List<IntegratedMedicineInfo> getByNameLikeOrCategoryOrAliasOrNameAndSkuIdLike();
    List<IntegratedMedicineInfo> getBySkuId(String sku_id);

    List<IntegratedMedicineInfo> findByNameContainingOrComponentNameContainingOrAliasContainingOrCategoryContainingOrContraindicationsContainingOrMeridianTasteContaining(String name, String componentName, String alias, String category, String contraindications, String meridianTaste);

}
