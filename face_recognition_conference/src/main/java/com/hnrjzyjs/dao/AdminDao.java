package com.hnrjzyjs.dao;

import com.hnrjzyjs.entity.Admin;

import java.util.List;

public interface AdminDao {

    int insertAdmin(Admin admin);

    List<Admin> selectAdmin();

    int updateAdminByphone_number(Admin admin);
}
