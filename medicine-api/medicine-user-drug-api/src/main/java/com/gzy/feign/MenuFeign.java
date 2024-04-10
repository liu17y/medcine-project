package com.gzy.feign;

import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@FeignClient(value = "user-service")
public interface MenuFeign {
    @GetMapping("/menu/list/{userId}")
    public ResultData MenuList(@PathVariable("userId") Integer userId);

    @GetMapping("/menu/list")
    public ResultData MenuListTest(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
