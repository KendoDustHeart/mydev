package com.hnrjzyjs.dao;

import com.hnrjzyjs.entity.User;

import java.util.List;

public interface UserDao {

    int insertUser(User user);

    List<User> selectUser();

    int updateUserByphone_number(User user);
}
