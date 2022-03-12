package com.example.demoredis.service;

import com.example.demoredis.entity.User;
import com.example.demoredis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@CacheConfig(cacheNames = "users")
public class UserService {
    @Autowired
    UserMapper userMapper;

    @Cacheable(key = "#p0")
    public User getUserById(String id) {
        System.out.println("getUser");
        return userMapper.findById(id);
    }

    @CachePut(key = "#p0")
    public void updateById(User user) {
        System.out.println("update");
        userMapper.updateById(user);
    }

    @CacheEvict(key = "#p0", allEntries = true)
    public void deleteById(String id) {
        System.out.println("delete");
        userMapper.deleteById(id);
    }

    @Cacheable(key = "#p0")
    public int addUser(String name, Integer age) {
        int res = userMapper.addUser(name, age);
        return res;
    }
}
