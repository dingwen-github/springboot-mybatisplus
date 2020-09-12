package com.dw.springbootmybatisplus.controller;

import com.dw.springbootmybatisplus.entity.User;
import com.dw.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.getUserList();
    }
}
