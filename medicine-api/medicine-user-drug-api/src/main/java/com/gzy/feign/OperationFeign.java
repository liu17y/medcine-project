package com.gzy.feign;

import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@FeignClient(value = "user-service")
public interface OperationFeign {
    @GetMapping("/operation/operationLog/{currentPage}/{pageSize}")
    public PageResult queryAllLog(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String queryString);

    @GetMapping("/operation/{currentPage}/{pageSize}")
    public ResultData findById(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize);

    @GetMapping("/operation/export/{ids}")
    public void exportExcel(@PathVariable(required = false) List<Integer> ids, HttpServletResponse response, String token);
}
