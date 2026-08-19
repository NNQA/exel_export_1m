package com.example.exportexcel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.exportexcel.Domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
