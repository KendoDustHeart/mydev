package com.hnrjzyjs.service.impl;

import com.hnrjzyjs.dao.UserDao;
import com.hnrjzyjs.entity.User;
import com.hnrjzyjs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int addUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> findUsers() {
        return userDao.selectUser();
    }

    @Override
    public int modifyUser(User user) {
        return userDao.updateUserByphone_number(user);
    }

}
