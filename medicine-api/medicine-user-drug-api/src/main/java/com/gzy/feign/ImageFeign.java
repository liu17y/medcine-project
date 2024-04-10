package com.gzy.feign;


import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "user-service")
public interface ImageFeign {
    @PostMapping("/image/userImage")
    public ResultData uploadUserImgByOSS(@RequestParam("file") MultipartFile file);
}
