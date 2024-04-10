package com.gzy.feign;

import com.gzy.dto.TcMedicineCategoryDto;
import com.gzy.dto.WMedicineAndTcMedicineDto;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user-service")
public interface TcMedicineFeign {
    @GetMapping("/tcMedicine/tr/{currentPage}/{pageSize}")
    public PageResult findListByCondition(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/tcMedicine/trClient/{currentPage}/{pageSize}")
    public PageResult findListByConditionClient(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/tcMedicine/my/{currentPage}/{pageSize}")
    public PageResult findListByConditionVo(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/tcMedicine/tr")
    public ResultData findListByCondition();

    @GetMapping("/tcMedicine/trList")
    public PageResult findListByConditionFont(String queryString);

    @GetMapping("/tcMedicine/{id}")
    public ResultData findById(@PathVariable("id") String id);

    @PostMapping("/tcMedicine/my")
    public ResultData findByIdObject(@RequestBody WMedicineAndTcMedicineDto medicineAndTcMedicineDto);

    @PostMapping("/tcMedicine/insertTcMedicine")
    public ResultData insertTcMedicine(@RequestBody TcMedicineCategoryDto tcMedicineCategoryDto);

    @DeleteMapping("/tcMedicine/deleteTcMedicine/{ids}")
    public ResultData deleteTcMedicine(@PathVariable("ids") List<String> ids);

    @PutMapping("/tcMedicine/updateTcMedicine")
    public ResultData updateTcMedicine(@RequestBody TcMedicineCategoryDto tcMedicineCategoryDto);

    @GetMapping("/tcMedicine/clientTr/{currentPage}/{pageSize}")
    public PageResult clientFindListByCondition(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String category);

    @GetMapping("/tcMedicine/searchClient/{currentPage}/{pageSize}")
    public PageResult clientFindListByMedicineCondition(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String category);
}
