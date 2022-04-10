package com.hnrjzyjs.service;

import com.hnrjzyjs.entity.Admin;

import java.util.List;

public interface AdminService {

    int addAdmin(Admin admin);

    List<Admin> findAdmins();

    int modifyAdmin(Admin admin);
}
