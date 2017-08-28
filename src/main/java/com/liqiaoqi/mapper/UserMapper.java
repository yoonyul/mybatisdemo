package com.liqiaoqi.mapper;

/**
 * Created by Administrator on 2017/8/25 0025.
 */
import com.liqiaoqi.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
//该注解是解决IDEA mapper注入时显示could not autowire的问题
@Component(value = "userMapper")
public interface UserMapper {

    //@Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    //@Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    User findByNameAndIdAndAge(@Param("name") String name, @Param("id") Long id,@Param("age") int age);

    List<User> findAllByName(@Param("name") String name);
}
