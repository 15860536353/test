package com.example.demo.config;

import com.example.demo.pojo.ExcludePathPatterns;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class Config implements WebMvcConfigurer {

    @Autowired
    private LoginAuthInterceptor loginAuthInterceptor ;

    @Autowired
    private ExcludePathPatterns excludePath;

    //跨域
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      // 添加路径规则
                .allowCredentials(true)               // 是否允许在跨域的情况下传递Cookie
                .allowedOriginPatterns("*")           // 允许请求来源的域规则
                .allowedMethods("*")
                .allowedHeaders("*") ;                // 允许所有的请求头
    }
    //拦截
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginAuthInterceptor)
                .excludePathPatterns(
                        "/admin/system/index/login",
                        "/admin/system/index/generateCode",
                        "/doc.html",
                        "/**/swagger-ui/**",
                        "/**/swagger-resources/**",
                        "/**/v3/**",
                        "/swagger-ui/**",
                        "/v3/api-docs/**"
                )
                .addPathPatterns("/**");
    }

}
