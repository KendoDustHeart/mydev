package com.hnrjzyjs.service;

import com.hnrjzyjs.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findUsers();

    int modifyUser(User user);

}
