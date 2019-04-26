package com.wan.service;

import com.wan.entity.User;
import com.wan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(){
        return userMapper.list();
    }

    public User findUserById(Integer id){
        return userMapper.findUserById(id);
    }

    public void insert(User user){
        userMapper.insert(user);
    }

}
