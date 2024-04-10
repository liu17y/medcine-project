package com.gzy.feign;

import com.gzy.dto.WMedicineCategoryDto;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import com.gzy.vo.WMedicineCategoryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user-service")
public interface WMedicineFeign {

    @GetMapping("/wMedicine/medicine/{currentPage}/{pageSize}")
    public PageResult findListByCondition(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/wMedicine/medicineClient/{currentPage}/{pageSize}")
    public PageResult findListByConditionClient(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/wMedicine/{id}")
    public ResultData findById(@PathVariable("id") String id);

    @PutMapping("/wMedicine/update")
    public ResultData update(@RequestBody WMedicineCategoryVo wMedicineCategoryVo);

    @PostMapping("/wMedicine/addMedicine")
    public ResultData insertMedicine(@RequestBody WMedicineCategoryDto medicineCategoryDto);

    @DeleteMapping("/wMedicine/delete/{ids}")
    public ResultData delete(@PathVariable("ids") List<String> ids);

    @GetMapping("/wMedicine/clientMedicine/{currentPage}/{pageSize}")
    public PageResult clientFindListByCondition(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String category);

}
