package com.gzy.feign;

import com.gzy.entity.TTcmConstitutionIdentification;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "user-service")
public interface TTcmConstitutionIdentificationFeign {

    @GetMapping("/identification/tcm/{currentPage}/{pageSize}")
    public PageResult selectTomConstitutionIdentificationByCondition(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String queryString);

    @GetMapping("/identification/info/{id}")
    public ResultData selectTomConstitutionIdentificationById(@PathVariable("id")Integer id);

    @DeleteMapping("/identification/{ids}")
    public ResultData deleteTomConstitutionIdentificationById(@PathVariable("ids") List<Integer> ids);

    @PutMapping("/identification/info")
    public ResultData updateTomConstitutionIdentificationById(@RequestBody TTcmConstitutionIdentification tcmConstitutionIdentification);

    @PostMapping("/identification/healthInfo")
    public ResultData insertTomConstitutionIdentification(@RequestBody TTcmConstitutionIdentification tcmConstitutionIdentification);

}
