package com.wx.miniapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@MapperScan("com.wx.miniapp.dao")
@SpringBootApplication
public class WxMaDemoApplication{
    public static void main(String[] args) {
        SpringApplication.run(WxMaDemoApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    miniapp启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
            " ______                    _   ______            \n" +
            "|_   _ \\                  / |_|_   _ `.          \n" +
            "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
            "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
            " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
            "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
    }
}
