package com.hnrjzyjs.controller;

import com.hnrjzyjs.entity.Admin;
import com.hnrjzyjs.entity.User;
import com.hnrjzyjs.service.AdminService;
import com.hnrjzyjs.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private AdminService adminService;

    @Transactional
    @PostMapping("/addUser.do")
    public String addUser(String name,
                          String password,
                          String phone_number,
                          String login_identity){
        String data;
        if ("user".equals(login_identity)){
            List<User> userList = userService.findUsers();
            for (User users:userList){
                if (users.getUsername().equals(name)){
                    return data = "用户名已经被人注册过了，请换一个用户名!";
                }
            }
            User user = new User();
            user.setUsername(name);
            user.setPassword(password);
            user.setPhone_number(phone_number);
            int result = userService.addUser(user);
            if (result > 0){
                return data = "恭喜你，用户注册成功!";
            }else {
                return data = "不好意思，用户注册失败，请重新注册!";
            }
        }else {
            List<Admin> adminList = adminService.findAdmins();
            for (Admin admins:adminList){
                if(admins.getAdminname().equals(name)){
                    return data = "管理员名已经被人注册过了，请换一个管理员名!";
                }
            }
            Admin admin = new Admin();
            admin.setAdminname(name);
            admin.setPassword(password);
            admin.setPhone_number(phone_number);
            int result = adminService.addAdmin(admin);
            if (result > 0){
                return data = "恭喜你，管理员注册成功!";
            }else {
                return data = "不好意思，管理员注册失败，请重新注册!";
            }
        }
    }

    @RequestMapping("/selectUser.do")
    public String selectUser(String name,
                           String password,
                           String login_identity) {
        String data = "";
        if ("user".equals(login_identity)) {
            List<User> userList = userService.findUsers();
            for (User user : userList) {
                if (user.getUsername().equals(name) && user.getPassword().equals(password)) {
                    return data = "success";
                }
            }
        }else {
            List<Admin> adminList = adminService.findAdmins();
            for (Admin admin : adminList) {
                if (admin.getAdminname().equals(name) && admin.getPassword().equals(password)) {
                    return data = "success";
                }
            }
        }
        return data;
    }

    @Transactional
    @RequestMapping("/updateUser.do")
    public String updateUser(String name,
                             String password,
                             String phone_number,
                             String login_identity){
        String data;
        if ("user".equals(login_identity)){
            List<User> userList = userService.findUsers();
            for (User users:userList){
                if (!users.getUsername().equals(name)){
                    return data = "没有找到你的用户名,请重新注册一个用户号!";
                }
                if (!users.getPhone_number().equals(phone_number)){
                    return data = "你的手机号输入错误或不存在，请重新输入!";
                }
            }
            User user = new User();
            user.setPassword(password);
            user.setUsername(name);
            int result = userService.modifyUser(user);
            if (result > 0){
                return data = "恭喜你，密码更改成功!";
            }else {
                return data = "不好意思，密码更改失败，密码格式有误!";
            }
        }else {
            List<Admin> adminList = adminService.findAdmins();
            for (Admin admins:adminList){
                if(!admins.getAdminname().equals(name)){
                    return data = "没有找到你的管理员名,请重新注册一个管理员号!";
                }
                if(!admins.getPhone_number().equals(phone_number)){
                    return data = "你的手机号输入错误或不存在，请重新输入!";
                }
            }
            Admin admin = new Admin();
            admin.setPassword(password);
            admin.setAdminname(name);
            int result = adminService.modifyAdmin(admin);
            if (result > 0){
                return data = "恭喜你，密码更改成功!";
            }else {
                return data = "不好意思，密码更改失败，密码格式有误!";
            }
        }
    }
}
