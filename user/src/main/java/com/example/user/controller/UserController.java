package com.example.user.controller;


import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
 public User createuser(@RequestBody User user){
        return userService.saveuser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserbyid(id);
    }
    @GetMapping("/list")
    public List<User> getallUsers(){
        return userService.getallUsers();
    }



}
