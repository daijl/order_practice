package com.djl.dd.service;

import com.djl.dd.model.User;

import java.util.List;

public interface UserService {
    void insertUser(User user);
    void deleteUserById(Integer id);
    void updateUserById(Integer id);
    User selectUserById(Integer id);
    User selectUserByName(String name);
    User selectUserByPhone(String phone);
    List<User> selectAllUsers();
}
