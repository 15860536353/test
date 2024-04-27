package com.example.demo.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Code验证码响应结果数据")
public class CodeVo {
    private String codeKey ;        // 验证码的key
    private String codeValue ;      // 图片验证码对应的字符串数据

}
