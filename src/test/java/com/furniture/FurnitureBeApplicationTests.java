package com.furniture;

import com.furniture.entity.Admin;
import com.furniture.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootTest
class FurnitureBeApplicationTests {

    @Autowired
    AdminMapper adminMapper;
    @Test
    void contextLoads() {
    }

    @Test
    void testFind(){
        Admin admin = adminMapper.selectById(100000);
        System.out.println(admin);
    }

}
