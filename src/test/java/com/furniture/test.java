package com.furniture;

import com.furniture.controller.AdminController;
import com.furniture.controller.NoticeController;
import com.furniture.entity.Admin;
import com.furniture.entity.Notice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

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

    @Autowired
    private NoticeController noticeController;
    @Test
    public void testAddNotice(){
        Notice notice = new Notice();
        notice.setTopic("1");
        notice.setContent("dsafshfjasfa");
        notice.setCreateTime(LocalDateTime.now());
        notice.setAuthorId(100000);
        notice.setType(2);
        notice.setReadTimes(1L);
        noticeController.addNotice(null,notice);
    }
}
