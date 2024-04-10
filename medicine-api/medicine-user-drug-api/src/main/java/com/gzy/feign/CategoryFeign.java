package com.gzy.feign;

import com.gzy.result.ResultData;
import com.gzy.vo.WCategoryVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "user-service")
public interface CategoryFeign {

    @GetMapping("/category/vmInfo")
    public List<WCategoryVo> findAllWCategory();

    @GetMapping("/category/tcInfo")
    public List<WCategoryVo> seacherAllWCategory();

    @GetMapping("/category/tcClassify")
    public ResultData findWCategory();

    @GetMapping("/category/vmClassify")
    public ResultData findVmCategory();
}
