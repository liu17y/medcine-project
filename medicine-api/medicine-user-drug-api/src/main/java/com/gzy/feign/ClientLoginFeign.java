package com.gzy.feign;
;
import com.gzy.dto.UserDto;
import com.gzy.result.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "user-service")
public interface ClientLoginFeign {
    @PostMapping("/client/login")
    public ResultData login(@RequestBody UserDto userDto);

    @PostMapping("/client/forgotPassword")
    public ResultData forgetPassword(@RequestBody UserDto userDto);
}
