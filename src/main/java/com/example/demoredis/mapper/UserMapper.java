package com.example.demoredis.mapper;

import com.example.demoredis.entity.User;
import org.apache.ibatis.annotations.*;
@Mapper
public interface UserMapper {
    @Insert("insert into user(name,age) values(#{name},#{age})")
    int addUser(@Param("name") String name,@Param("age") Integer age);

    @Select("select *from user where id=#{id}")
    User findById(@Param("id") String id);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    void updateById(User user);

    @Delete("delete from user where id=#{id}")
    void deleteById(@Param("id") String id);
}
