package com.example.user.service;

import com.example.user.model.User;

import java.util.List;

public interface UserService {
    User saveuser(User user);
    User getUserbyid (Integer id);
    List<User> getallUsers();

}
