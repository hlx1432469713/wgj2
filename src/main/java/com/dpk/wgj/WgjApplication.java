package com.dpk.wgj;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
@MapperScan(basePackages = " com.dpk.wgj" , markerInterface = Mapper.class)
public class WgjApplication  {
    public static void main(String[] args) {
        SpringApplication.run(WgjApplication.class, args);
    }
}
