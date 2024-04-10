package com.gzy.feign;

import com.gzy.entity.ChinesePatentDrug;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user-service")
public interface ChineseMedicineFeign {
    @GetMapping("/chinese/chinesePatentDrug/{currentPage}/{pageSize}")
    public PageResult selectChinesePatentDrugByCondition(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String chinesePatentDrug);

    @DeleteMapping("/chinese/{ids}")
    public ResultData deleteChinesePatentDrugById(@PathVariable("ids") List<String> ids);

    @GetMapping("/chinese/{ids}")
    public ResultData getChinesePatentDrugById(@PathVariable("ids") String ids);

    @PutMapping("/chinese/chinesePatentDrug")
    public ResultData updateChinesePatentDrug(@RequestBody ChinesePatentDrug chinesePatentDrug);

    @PostMapping("/chinese/chinesePatentDrug")
    public ResultData addChinesePatentDrug(@RequestBody ChinesePatentDrug chinesePatentDrug);

    @GetMapping("/chinese/medicine/proprietaryChineseMedicine")
    public ResultData proprietaryChineseMedicine();
}


