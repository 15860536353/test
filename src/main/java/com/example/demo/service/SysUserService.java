package com.example.demo.service;

import com.example.demo.dto.LoginDto;
import com.example.demo.pojo.SysUser;
import com.example.demo.vo.LoginVo;

public interface SysUserService {
    LoginVo login(LoginDto loginDto);

    SysUser getUserInfo(String token);

    void logout(String token);
}
