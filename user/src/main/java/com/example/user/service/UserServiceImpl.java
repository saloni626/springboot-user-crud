package com.example.user.service;

import com.example.user.dao.UserDao;
import com.example.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserDao userDao;

    @Override
    public User saveuser(User user) {
        return userDao.save(user);
    }

    @Override
    public User getUserbyid(Integer id) {
        return userDao.findById(id).orElse(null);
    }

    @Override
    public List<User> getallUsers() {
        return userDao.findAll();
    }
}
