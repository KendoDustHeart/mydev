package com.hnrjzyjs.service.impl;

import com.hnrjzyjs.dao.AdminDao;
import com.hnrjzyjs.entity.Admin;
import com.hnrjzyjs.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminDao adminDao;

    @Override
    public int addAdmin(Admin admin) {
        return adminDao.insertAdmin(admin);
    }

    @Override
    public List<Admin> findAdmins() {
        return adminDao.selectAdmin();
    }

    @Override
    public int modifyAdmin(Admin admin) {
        return adminDao.updateAdminByphone_number(admin);
    }
}
