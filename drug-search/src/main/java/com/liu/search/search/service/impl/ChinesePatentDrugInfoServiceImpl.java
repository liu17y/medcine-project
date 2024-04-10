package com.liu.search.search.service.impl;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gzy.dao.ChinesePatentDrugDao;
import com.gzy.dao.TcMedicineDao;
import com.gzy.dao.WMedicineDao;
import com.gzy.entity.ChinesePatentDrug;
import com.gzy.entity.TcMedicine;
import com.gzy.entity.WMedicine;
import com.gzy.utils.ResultData;
import com.gzy.vo.TcMedicineCategoryVo;
import com.gzy.vo.WMedicineCategoryVo;
import com.liu.search.search.elasticsearch.IntegratedMedicineInfo;
import com.liu.search.search.repository.IntegratedMedicineSearchRepository;
import com.liu.search.search.service.ChinesePatentDrugInfoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ChinesePatentDrugInfoServiceImpl implements ChinesePatentDrugInfoService {
    @Resource
    private ChinesePatentDrugDao chinesePatentDrugDao;

    @Resource
    private TcMedicineDao tcMedicineDao;

    @Resource
    private WMedicineDao medicineDao;

    @Resource
    private IntegratedMedicineSearchRepository medicineSearchRepository;
    @Override
    public void addAll() {
        Integer count = Math.toIntExact(chinesePatentDrugDao.selectCount(new QueryWrapper<>()));
        Integer startNum = 1;
        Integer endNum = 500;
        // 总页数
        int totalPage = count % endNum == 0?count/endNum : (count / endNum) +1;

        for (int i = startNum; i <= totalPage; i++) {
            List<ChinesePatentDrug> chinesePatentDrugs = chinesePatentDrugDao.queryListsChinesePatentDrugDao();
            List<IntegratedMedicineInfo> medicineInfos = JSON.parseArray(JSON.toJSONString(chinesePatentDrugs), IntegratedMedicineInfo.class);
            medicineSearchRepository.saveAll(medicineInfos);
        }

    }

    @Override
    public ResultData medicineList() {
        Iterable<IntegratedMedicineInfo> all = medicineSearchRepository.findAll();
        return new ResultData(true,200,"成功",all);
    }

    @Override
    public ResultData medicineByID(String id) {
        Optional<IntegratedMedicineInfo> drugInfo = medicineSearchRepository.findById(id);
        String skuid = drugInfo.get().getSkuId();
        System.out.println("skuid:"+skuid);
        if (drugInfo.get().getSkuId().equals("1")){
            //BeanUtils.copyProperties(tcMedicineList,drugInfo.get());
            TcMedicine tcMedicine = JSON.parseObject(JSON.toJSONString(drugInfo.get()), TcMedicine.class);

            return new ResultData(true,200,"成功",tcMedicine);
        }else if (drugInfo.get().getSkuId().equals("2")){
            // BeanUtils.copyProperties(drugInfo.get(),wMedicineList);
            WMedicine wMedicine = JSON.parseObject(JSON.toJSONString(drugInfo.get()), WMedicine.class);
            return new ResultData(true,200,"成功",wMedicine);
        } else if (drugInfo.get().getSkuId().equals("3")){
            ChinesePatentDrug chinesePatentDrug = JSON.parseObject(JSON.toJSONString(drugInfo.get()), ChinesePatentDrug.class);
            return new ResultData(true,200,"成功",chinesePatentDrug);
        }
        return new ResultData(false,402,"失败");
    }

    @Override
    public void addAllChine() {
        Integer count = Math.toIntExact(tcMedicineDao.selectCount(new QueryWrapper<>()));
        Integer startNum = 1;
        Integer endNum = 500;

        int totalPage = count % endNum == 0?count/endNum : (count / endNum) +1;
        for (int i = startNum; i <= totalPage; i++) {
            List<TcMedicineCategoryVo> medicineList = tcMedicineDao.findMedicineList();
            List<IntegratedMedicineInfo> integratedMedicineInfos = JSON.parseArray(JSON.toJSONString(medicineList), IntegratedMedicineInfo.class);
            medicineSearchRepository.saveAll(integratedMedicineInfos);
        }
    }

    @Override
    public ResultData getInfoClientByElasticSearch(Integer page, Integer size,String name, String alias, String category,String character, String componentName,Integer skuId) {
        PageRequest pageRequest = PageRequest.of(page, size);
        //List<IntegratedMedicineInfo> medicineInfoList = medicineSearchRepository.getByNameOrCategoryOrAliasOrComponentNameOrCharacterAndSkuid(name, category, alias, character, componentName, skuId);
        Page<IntegratedMedicineInfo> medicineInfos = medicineSearchRepository.findAll(pageRequest);
        return new ResultData(true,200,"成功",medicineInfos);
    }


//    @Resource
//    private RestHighLevelClient client;
    @Override
    public ResultData searchByQuery(String queryString, Integer page, Integer size) {
//        SearchRequest request = new SearchRequest("integrated_medicine_info");
//        //查询资源构建器
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        //设置查询条件
//        //builder.query(QueryBuilders.termQuery("skuId", skuId));// 精准匹配
//        builder.query(QueryBuilders.matchQuery("name", name));
//        builder.query(QueryBuilders.wildcardQuery("category", category));
//        builder.query(QueryBuilders.wildcardQuery("alias", alias));
//        request.source(builder);
//
//        SearchResponse response = client.search(request, RequestOptions.DEFAULT);
//
//        //获取命中信息
//        SearchHits responseHits = response.getHits();
//
//        List<IntegratedMedicineInfo> students = Arrays.stream(responseHits.getHits()).map(hit->{
//            Map<String, Object> map = hit.getSourceAsMap();
//            JSONObject json = new JSONObject();
//            json.putAll(map);
//            return json.toJavaObject(IntegratedMedicineInfo.class);
//        }).collect(Collectors.toList());//将流中的所有元素收集到列表中。
//        students.forEach(System.out::println);

        //List<IntegratedMedicineInfo> medicineInfoPage = medicineSearchRepository.getByNameLikeAndSkuIdLike(skuId,name);
        //PageRequest pageRequest = PageRequest.of(page, size);
        //List<IntegratedMedicineInfo> medicineInfoList = medicineSearchRepository.findByNameContainingOrComponentNameContainingOrAliasContainingOrCategoryContainingOrContraindicationsContainingOrMeridianTasteContaining(queryString, queryString, queryString, queryString,queryString,queryString);
        return new ResultData(true,200,"成功");
    }

    @Override
    public void addAllWmedicine() {
        // int size = medicineDao.findwMedicineList().size();
        int count = Math.toIntExact(medicineDao.selectCount(new QueryWrapper<>()));
        Integer startNum = 1;
        Integer endNum = 500;
        int totalPage = count % endNum == 0?count/endNum : (count / endNum) +1;
        for (int i = startNum; i <= totalPage; i++) {
            List<WMedicineCategoryVo> medicineList = medicineDao.findwMedicineList();
            List<IntegratedMedicineInfo> integratedMedicineInfos = JSON.parseArray(JSON.toJSONString(medicineList), IntegratedMedicineInfo.class);
            medicineSearchRepository.saveAll(integratedMedicineInfos);
        }
    }

    @Override
    public ResultData medicineBySkuId(String sku_id) {
        List<IntegratedMedicineInfo> drugInfo = medicineSearchRepository.getBySkuId(sku_id);
        List<TcMedicine> tcMedicineList =null;
        List<WMedicine> wMedicineList =null;
        List<ChinesePatentDrug> chinesePatentDrugList =null;
        ArrayList<Object> objectArrayList = new ArrayList<>();
        for (IntegratedMedicineInfo info : drugInfo) {

            String skuid = info.getSkuId();
            System.out.println("skuid:"+skuid);
            if (info.getSkuId().equals("1")){
                tcMedicineList = JSON.parseArray(JSON.toJSONString(drugInfo), TcMedicine.class);
                objectArrayList.add(tcMedicineList);
                return new ResultData(true,200,"成功",objectArrayList);
            }else if (info.getSkuId().equals("2")){
                wMedicineList = JSON.parseArray(JSON.toJSONString(drugInfo), WMedicine.class);
                objectArrayList.add(wMedicineList);
                return new ResultData(true,200,"成功",objectArrayList);
            } else if (info.getSkuId().equals("3")){
                chinesePatentDrugList = JSON.parseArray(JSON.toJSONString(drugInfo), ChinesePatentDrug.class);
                objectArrayList.add(chinesePatentDrugList);
                return new ResultData(true,200,"成功",objectArrayList);
            }
        }
        return new ResultData(false,402,"失败");
    }


}
