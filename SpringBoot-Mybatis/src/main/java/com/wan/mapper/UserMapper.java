package com.wan.mapper;

import com.wan.entity.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {


    @Select("select * from users")
    @Results({
            @Result(property = "sex", column = "user_sex")
    })
    List<User> list();

    @Select("select * from users where id=#{id}")
    @Results({
            @Result(property = "sex", column = "user_sex")
    })
    User findUserById(Integer id);

    @Insert("INSERT INTO users(username,password,user_sex,nick_name) VALUES(#{username}, #{password}, #{user_sex},#{nick_name})")
    void insert(User user);
}
