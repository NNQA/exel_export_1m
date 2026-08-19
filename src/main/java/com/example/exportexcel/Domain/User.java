package com.example.exportexcel.Domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@TableName("users")
public class User {

    @ExcelProperty("id")
    private Long id;

    @ExcelProperty("name")
    private String name;

    @ExcelProperty("email")
    private String email;

    @ExcelProperty("phone")
    private String phoneNumber;

    @ExcelProperty("status")
    private String status;

    @ExcelProperty("createdAt")
    private LocalDateTime createdAt;

    public User(String name, String email, String phoneNumber, String status, LocalDateTime createdAt) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.createdAt = createdAt;
    }
}