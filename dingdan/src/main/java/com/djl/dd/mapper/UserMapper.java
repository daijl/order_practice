package com.djl.dd.mapper;

import com.djl.dd.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    void insertUser(User user);
    void deleteUserById(Integer id);
    void updateUserById(Integer id);
    User selectUserById(Integer id);
    User selectUserByName(String name);
    User selectUserByPhone(String phone);
    List<User> selectAllUsers();


}
