package com.wx.miniapp.annotation;

/**
 * @author JackHu
 * @Log引入Aop
 * @email 790327374@qq.com
 * @date 2019/1/8 10:59
 */
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    String value() default "";
}

