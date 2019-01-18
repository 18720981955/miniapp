package com.wx.miniapp.config;

import com.wx.miniapp.Interceptor.AuthenticationInterceptor;
import com.wx.miniapp.handler.CurrentUserMethodArgumentResolver;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;
/**
 *
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2019/1/10 9:38
 * @Description: 配置自定义URLInterceptor拦截器，以及拦截路径
 */
@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurationSupport {

    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        // 注册JsonPathArgumentResolver的参数分解器
        argumentResolvers.add(new CurrentUserMethodArgumentResolver());
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(authenticationInterceptor())
            .addPathPatterns("/token");
        super.addInterceptors(registry);
    }


    @Bean
    public CurrentUserMethodArgumentResolver currentUserMethodArgumentResolver() {
        return new CurrentUserMethodArgumentResolver();
    }

    /**
     * 解决 拦截器中注入bean 失败情况出现
     * addArgumentResolvers方法中 添加
     *  argumentResolvers.add(currentUserMethodArgumentResolver());
     */
    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }
}
