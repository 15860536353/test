package com.example.demo.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "interception.release")
public class ExcludePathPatterns {
    private List<String> Urls ;
}
