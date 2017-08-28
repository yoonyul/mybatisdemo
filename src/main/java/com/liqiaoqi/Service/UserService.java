package com.liqiaoqi.Service;


import com.liqiaoqi.domain.User;
import com.liqiaoqi.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25 0025.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String findByName(){
        //userMapper.insert("pinky",20);
        User u =  userMapper.findByName("somi");
        return u.getName();
    }

    public User findByNameAndIdAndAge(String name,Long id,int age){
        return userMapper.findByNameAndIdAndAge(name,id,age);
    }

    public List<User> findAllByName(){
        return userMapper.findAllByName("somi");
    }
}
