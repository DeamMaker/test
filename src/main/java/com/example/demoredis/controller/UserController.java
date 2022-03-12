package com.example.demoredis.controller;

import com.example.demoredis.entity.User;
import com.example.demoredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/{id}")
    public User ForTest(@PathVariable String id){
        return userService.getUserById(id);
    }
    @RequestMapping("/update/")
    public String update(User user){
        userService.updateById(user);
        return "success";
    }
    @RequestMapping("/delete/{id}")
    public String delete (@PathVariable String id){
        userService.deleteById(id);
        return "delete success";
    }
}
