package com.wx.miniapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 文件
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/23 16:36
 */
@Component
@ConfigurationProperties(prefix="file")
public class FileConfig {
    //上传路径
    private String uploadPath;

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }
}
