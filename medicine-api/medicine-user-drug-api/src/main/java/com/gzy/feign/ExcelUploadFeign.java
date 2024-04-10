package com.gzy.feign;

import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "user-service")
public interface ExcelUploadFeign {
    @PostMapping("/WMedicine/uploadExcel")
    public ResultData uploadExcel(@RequestBody MultipartFile medicineExcel);
}
