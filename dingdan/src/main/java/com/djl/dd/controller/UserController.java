package com.djl.dd.controller;


import com.djl.dd.model.User;
import com.djl.dd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping(value = "/insertUser")
    public void insertUser(User user){
        userService.insertUser(user);
    };

    @PostMapping(value = "/deleteUserById")
    public void deleteUserById(Integer id){
        userService.deleteUserById(id);
    };

    @PostMapping(value = "/updateUserById")
    public void updateUserById(Integer id){
        userService.updateUserById(id);
    };

    @PostMapping(value = "/getUserById")
    public User getUserById(Integer id){
        if(id != null){
            return userService.selectUserById(id);
        }else{
            return null;
        }
    }

    @PostMapping(value = "/selectUserByName")
    public User selectUserByName(String name){
        return userService.selectUserByName(name);
    };

    @PostMapping(value = "/selectUserByPhone")
    public User selectUserByPhone(String phone){
        return userService.selectUserByPhone(phone);
    };

    @PostMapping(value = "/selectAllUsers")
    public List<User> selectAllUsers(){
        return userService.selectAllUsers();
    };

}
