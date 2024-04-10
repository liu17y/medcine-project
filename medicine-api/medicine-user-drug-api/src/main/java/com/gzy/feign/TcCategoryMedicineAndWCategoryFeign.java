package com.gzy.feign;

import com.gzy.entity.TcCategoryMedicine;
import com.gzy.entity.WCategoryMedincine;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "user-service")
public interface TcCategoryMedicineAndWCategoryFeign {

    @GetMapping("/tcCategoryMedicine/vmMedicine/{currentPage}/{pageSize}")
    public PageResult findListByConditionVm(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/tcCategoryMedicine/vmMedicine")
    public ResultData findListByConditionVm();

    @PostMapping("/tcCategoryMedicine/addVm")
    public ResultData addCategoryByConditionVm(@RequestBody WCategoryMedincine wCategoryMedincine);

    @GetMapping("/tcCategoryMedicine/tcMedicine/{currentPage}/{pageSize}")
    public PageResult findListByCondition(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/tcCategoryMedicine/tcMedicine")
    public ResultData findListByCondition();

    @PostMapping("/tcCategoryMedicine/add")
    public ResultData addTcCategoryMedicine(@RequestBody TcCategoryMedicine tcCategoryMedicine);
}
