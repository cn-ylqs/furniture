package com.furniture;

import com.furniture.controller.AdminController;
import com.furniture.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class test {

    @Autowired
    private AdminController adminController;
    @Test
    public void testLogin(){
        Admin admin = new Admin();
        admin.setTrueName("张三");
        admin.setPassword("123456");
        adminController.login(null,admin);
    }
}
