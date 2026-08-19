package com.example.exportexcel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.example.exportexcel.mapper")
@SpringBootApplication
public class ExportExcelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExportExcelApplication.class, args);
    }

}
