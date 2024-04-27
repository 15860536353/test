package com.example.demo.controller;

import com.example.demo.pojo.SysUser;
import com.example.demo.resule.Result;
import com.example.demo.resule.ResultCodeEnum;
import com.example.demo.dto.LoginDto;
import com.example.demo.service.CodeService;
import com.example.demo.service.SysUserService;
import com.example.demo.utils.ThreadLocalUtil;
import com.example.demo.vo.CodeVo;
import com.example.demo.vo.LoginVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "用户接口")
@RestController
@RequestMapping(value = "/admin/system/index")
public class IndexController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private CodeService codeService;

    @Operation(summary = "登录接口")
    @PostMapping(value = "/login")
    public Result<LoginVo> login(@RequestBody LoginDto loginDto) {
        LoginVo loginVo = sysUserService.login(loginDto) ;
        return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
    }
    @Operation(summary = "验证码接口")
    @GetMapping(value = "/generateCode")
    public Result<CodeVo> generateValidateCode() {
        CodeVo validateCodeVo = codeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }
    @Operation(summary = "获取用户信息接口")
    @GetMapping(value = "/getUserInfo")
    public Result<SysUser> getUserInfo() {
        return Result.build(ThreadLocalUtil.get()  , ResultCodeEnum.SUCCESS) ;
    }
    @Operation(summary = "用户退出接口")
    @GetMapping(value = "/logout")
    public Result logout(@RequestHeader(value = "token") String token) {
        sysUserService.logout(token) ;
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }
}
