package com.furniture;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*启动类*/
@MapperScan("com.furniture.mapper")
@SpringBootApplication
public class FurnitureBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FurnitureBeApplication.class, args);
    }


}
