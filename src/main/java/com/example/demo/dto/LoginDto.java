package com.example.demo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Login登录请求参数")
public class LoginDto {
    @Schema(description = "用户名")
    private String userName;

    @Schema(description = "密码")
    private String password;

    @Schema(description = "验证码")
    private String captcha ;

    @Schema(description = "rediskey值")
    private String codeKey ;

    private String dea;
}
