package com.gzy.feign;

import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@FeignClient(value = "user-service")
public interface LoginLogFeign {
    @GetMapping("/log/loginLog/{currentPage}/{pageSize}")
    public PageResult queryAllLog(@PathVariable("currentPage") Integer currentPage, @PathVariable("pageSize") Integer pageSize, String queryString);

    @GetMapping("/log/export")
    public void exportExcelList(HttpServletResponse response, String token);

    @GetMapping("/log/export/{ids}")
    public void exportExcel(@PathVariable(required = false) List<Integer> ids, HttpServletResponse response, String token);

    @GetMapping("/req/request")
    public ResultData request(HttpServletRequest request, HttpServletResponse response);
}
