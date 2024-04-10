package com.gzy.feign;

import com.gzy.dto.UserDto;
import com.gzy.entity.User;
import com.gzy.page.PageResult;
import com.gzy.result.ResultData;
import com.gzy.vo.UserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@FeignClient(value = "user-service")
public interface UserFeign {
    @PostMapping("/user/login")
    public ResultData login(@RequestBody UserDto userDto);

    @GetMapping("/user/loginInfo/{username}")
    public ResultData loginInfo(@PathVariable("username")String username);

    @GetMapping("/user/info/{currentPage}/{pageSize}")
    public PageResult userInfo(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/user/adminInfo/{currentPage}/{pageSize}")
    public PageResult adminInfo(@PathVariable("currentPage")Integer currentPage, @PathVariable("pageSize")Integer pageSize, String queryString);

    @GetMapping("/user/{id}")
    public ResultData findUserById(@PathVariable("id") Integer id);

    @DeleteMapping("/user/{ids}")
    public ResultData deleteUserById(@PathVariable("ids") List<Integer> ids);

    @GetMapping("/user/code")
    public void getCode(HttpServletRequest request);

    @PostMapping("/user/addUser")
    public ResultData addtUser(@RequestBody User user);

    @PostMapping("/user/register")
    public ResultData insertUser(@RequestBody UserDto userDto);

    @PutMapping("/user/infos")
    public ResultData updateUserByCondition(@RequestBody User user);

    @PutMapping("/user/info")
    public ResultData updateUserBy(@RequestBody User user);

    @GetMapping("/user/userToken")
    public ResultData token(@RequestParam("token") String token);

    @PostMapping("/user/updateUserType")
    public ResultData updateUserType(@RequestBody UserVo userVo);

    @PutMapping("/user/updataClientUesrStatus")
    public ResultData updataClientUesrStatus(@RequestBody UserDto userDto);

    @DeleteMapping("/user/loginOut")
    public ResultData loginOut(HttpServletRequest request);
}
