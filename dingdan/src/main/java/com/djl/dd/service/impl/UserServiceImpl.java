package com.djl.dd.service.impl;

import com.djl.dd.mapper.UserMapper;
import com.djl.dd.model.User;
import com.djl.dd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 注入mapper至service层
     */
    @Resource
    private UserMapper userMapper;

    @Override
    public void insertUser(User user){
        userMapper.insertUser(user);
    };

    @Override
    public void deleteUserById(Integer id){
        userMapper.deleteUserById(id);
    };

    @Override
    public void updateUserById(Integer id){
        userMapper.updateUserById(id);
    };

    @Override
    public User selectUserById(Integer id){
        return userMapper.selectUserById(id);
    }

    @Override
    public User selectUserByName(String name){
        return userMapper.selectUserByName(name);
    };

    @Override
    public User selectUserByPhone(String phone){
        return userMapper.selectUserByPhone(phone);
    };

    @Override
    public List<User> selectAllUsers(){
        return userMapper.selectAllUsers();
    };
}
