package com.hnrjzyjs;

import com.hnrjzyjs.entity.Admin;
import com.hnrjzyjs.entity.User;
import com.hnrjzyjs.service.AdminService;
import com.hnrjzyjs.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class FaceRecognitionConferenceApplicationTests {

    @Resource
    private AdminService adminService;

    @Resource
    private UserService userService;

    @Test
    void testOne() {
        Admin admin = new Admin();
        admin.setAdminname("王超");
        admin.setPassword("wc1124");
        int result = adminService.addAdmin(admin);
        System.out.println(result);
    }

    @Test
    void testTwo() {
        User user = new User();
        user.setUsername("王超");
        user.setPassword("wc1124");
        int result = userService.addUser(user);
        System.out.println(result);
    }

    @Test
    void testThree(){
        List<User> userList = userService.findUsers();
        for (User user:userList){
            System.out.println(user.getPhone_number());
        }
    }
}
