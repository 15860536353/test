package com.example.demo.mapper;

import com.example.demo.pojo.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserMapper {

//    @Select("select * from sys_user where username = #{userName} and is_deleted = 0")
    SysUser selectByUserName(String userName);
}
