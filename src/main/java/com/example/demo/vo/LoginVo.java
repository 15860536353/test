package com.example.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Login登录响应结果数据")
public class LoginVo {
    @Schema(description = "token")
    private String token ;
}
