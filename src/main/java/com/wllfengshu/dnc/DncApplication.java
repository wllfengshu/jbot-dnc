package com.wllfengshu.dnc;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableAspectJAutoProxy
@MapperScan(value = "com.wllfengshu.dnc.dao")
public class DncApplication {

    public static void main(String[] args) {
        SpringApplication.run(DncApplication.class, args);
    }

}

