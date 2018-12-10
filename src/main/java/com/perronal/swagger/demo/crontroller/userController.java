package com.perronal.swagger.demo.crontroller;

import com.alibaba.fastjson.JSON;
import com.perronal.swagger.demo.vo.ResponseMessage;
import com.perronal.swagger.demo.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api("用户管理Api")
public class userController {
    @GetMapping("/users")
    @ApiOperation(value = "获取用户列表", notes = "获取用户列表")
    public ResponseMessage<List<User>> queryAllUsers() {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "jack"));
        list.add(new User(2, "zhang"));
        ResponseMessage<List<User>> responseMessage = new ResponseMessage<>();
        responseMessage.setSuccessMessage(list);

        System.out.println("responseMessage = " + responseMessage);

        return responseMessage;
    }
}
