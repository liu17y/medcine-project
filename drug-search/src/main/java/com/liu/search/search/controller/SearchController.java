package com.liu.search.search.controller;
import com.gzy.utils.ResultData;
import com.liu.search.search.elasticsearch.IntegratedMedicineInfo;
import com.liu.search.search.service.ChinesePatentDrugInfoService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName SearchController
 * @Description TODO:使用elasticsearch全文搜索引进行搜索(由于前台搜索功能已经实现)
 * @Version 1.0
 * @Author liuzongyi
 **/
@RestController
@RequestMapping("search")
public class SearchController {

    @Resource
    private ChinesePatentDrugInfoService chinesePatentDrugInfoService;
    private List<QueryBuilder> should;

    @GetMapping("/add/All")
    public ResultData addAll(){
        try {
            chinesePatentDrugInfoService.addAll();
            chinesePatentDrugInfoService.addAllChine();
            chinesePatentDrugInfoService.addAllWmedicine();
            return new ResultData(true,200,"添加成功索引库",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultData(false,403,"添加失败索引库",null);
        }

    }

    @GetMapping("/medicineList")
    public ResultData medicineList(){
        ResultData resultData = chinesePatentDrugInfoService.medicineList();
        return resultData;
    }

    @GetMapping("/medicineList/{id}")
    public ResultData medicineList(@PathVariable String id){
        ResultData resultData = chinesePatentDrugInfoService.medicineByID(id);
        return resultData;
    }

//    @GetMapping("/medicineList")
//    public ResultData medicineLista(@PathParam("queryString") String queryString){
//        ResultData resultData = chinesePatentDrugInfoService.medicineByqueryString(queryString);
//        return resultData;
//    }

    @GetMapping("/List/{sku_id}")
    public ResultData medicineListBySkuId(@PathVariable String sku_id){
        ResultData resultData = chinesePatentDrugInfoService.medicineBySkuId(sku_id);
        return resultData;
    }

    @GetMapping("/add/allChine")
    public ResultData addAllChine(){
        try {
            chinesePatentDrugInfoService.addAllChine();
            return new ResultData(true,200,"添加成功索引库",null);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultData(false,403,"添加失败索引库",null);
        }
    }

    @GetMapping("/getInfo/client/{page}/{size}")
    public ResultData getInfoClient(@PathVariable("page") Integer page, @PathVariable("size") Integer size,String name, String alias, String category,String character, String componentName,@PathParam("skuId") Integer skuId ){
        ResultData resultData = chinesePatentDrugInfoService.getInfoClientByElasticSearch(page,size,name, alias, category, character, componentName, skuId);
        return resultData;
    }

    @Resource
    private ElasticsearchOperations elasticsearchOperations;

    /**
     * 客户端搜索
     * @param queryString
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/getInfo/clients/{page}/{size}")
    public ResultData search(@RequestParam("queryString") String queryString,
                             @RequestParam("skuId") String skuId,
                             @PathVariable Integer page,
                             @PathVariable Integer size) throws IOException {
        //ResultData resultData = chinesePatentDrugInfoService.searchByQuery(queryString, page, size);
        List<Object> list = new ArrayList<>();
        List<Map<String, String>> highlightResults = new ArrayList<>();

        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        boolQueryBuilder.should(QueryBuilders.multiMatchQuery("*" + queryString + "*").field("*"));

        // 如果 skuId 不为空，则添加精确匹配条件
        if (skuId != null && !skuId.isEmpty()) {
            boolQueryBuilder.must(QueryBuilders.termQuery("skuId", skuId));
        }
        HighlightBuilder highlightBuilder = new HighlightBuilder();
        // 设置标签前缀
        highlightBuilder.preTags("<font color='#dd4b39'>");
        // 设置标签后缀
        highlightBuilder.postTags("</font>");
        highlightBuilder.field("category")
                .field("adverseReaction")
                .field("componentName")
                .field("mainEffect")
                .field("clinicalApplication")
                .field("name")
                .field("character");
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(boolQueryBuilder)
                .withHighlightBuilder(highlightBuilder)
                //.withPageable(PageRequest.of(page, size))
                .build();
        SearchHits<IntegratedMedicineInfo> searchHits = elasticsearchOperations.search(searchQuery, IntegratedMedicineInfo.class);
        searchHits.forEach(searchHit -> {
            if (searchHit.getContent() != null){
                // 提取高亮字段
            Map<String, String> result = new HashMap<>();
                for (String esFieldName : searchHit.getHighlightFields().keySet()) {
                    // System.out.println(esFieldName);
                    for (Field declaredField : IntegratedMedicineInfo.class.getDeclaredFields()) {
                        if (esFieldName == declaredField.getName()){
                            List<String> highFields = searchHit.getHighlightFields().get(esFieldName);
                            for (String highField : highFields) {
                                // 匹配到高亮字段 组装数据返沪
                                if (highField != null && !highField.isEmpty()){
                                    // System.out.println(highField + "=======================>");
                                    result.put("skuId", searchHit.getContent().getSkuId());
                                    result.put("id", searchHit.getContent().getId());
                                    result.put("content",highField + "。");
                                    result.put(declaredField.getName(), "");
                                    //result.put(declaredField.getName(),highField);
                                }
                            }
                            break;
                        }
                    }
                }
                list.add(searchHit.getContent());
                if (!result.isEmpty()){
                    // System.out.println(result);
                    highlightResults.add(result);
                }
            }
        });
        if (!highlightResults.isEmpty()){
            return new ResultData(true,"获取成功",list,highlightResults);
        }
        return new ResultData(true,"没有数据",list,null);
    }

    private String getHighlightHtml(List<String> categoryHighlights) {
        // 正则表达式匹配<font color='#dd4b39'>内容</font>
        String regex = "<font color='#dd4b39'>(.*?)</font>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(categoryHighlights.toString());

        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            String part = matcher.group(1); // 提取<font>标签内的内容
            sb.append("'<font color='#dd4b39'>").append(part).append("</font>'" + ",");
        }
        String substring = sb.toString();
        // 移除最后一个逗号（如果有的话）
        if (substring.length() > 0) {
            substring = substring.substring(0, substring.length() - 1);
        }

        return substring;
    }

}
