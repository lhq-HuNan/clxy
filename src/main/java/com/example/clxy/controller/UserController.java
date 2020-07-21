package com.example.clxy.controller;

import com.example.clxy.entity.User;
import com.example.clxy.result.PageResult;
import com.example.clxy.result.WebRestResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Author liuhaoqi
 * @Date 2020/7/21 20:09
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public PageResult<User> login(@RequestBody User user) {
        PageResult<User> result = new PageResult<>();
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        result.setRows(list);
        return result;
    }
}
