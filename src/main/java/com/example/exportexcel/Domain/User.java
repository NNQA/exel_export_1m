package com.example.exportexcel.Domain;

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

    private Long id;

    private String name;

    private String email;

    private String phoneNumber;

    private String status;

    private LocalDateTime createdAt;

    public User(String name, String email, String phoneNumber, String status, LocalDateTime createdAt) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
        this.createdAt = createdAt;
    }
}