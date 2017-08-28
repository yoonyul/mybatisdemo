package com.liqiaoqi.Controller;

import com.liqiaoqi.Service.UserService;
import com.liqiaoqi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25 0025.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String findByName(){
        return userService.findByName();
    }

    @RequestMapping("/findByNameAndIdAndAge")
    public User findByNameAndIdAndAge(@RequestParam("name")String name, @RequestParam("id")Long id,
                                      @RequestParam("age")int age){ return userService.findByNameAndIdAndAge(name,id,age); }

    @RequestMapping("/findAllByName")
    public List<User> findAllByName(){ return userService.findAllByName(); }
}
