package com.wan.controller;

import com.wan.entity.User;
import com.wan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    @GetMapping("/get")
    public User findUserById(Integer id){
        return userService.findUserById(id);
    }

    @PostMapping("/add")
    public void add(User user){
        userService.insert(user);
    }
}
