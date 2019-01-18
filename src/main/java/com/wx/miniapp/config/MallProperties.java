package com.wx.miniapp.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author <a href="https://github.com/binarywang">Binary Wang</a>
 */
@Data
@ConfigurationProperties(prefix = "mall")
public class MallProperties {

    private List<MallConfig> mallconfig;

    @Data
    public static class MallConfig {
        /**
         * 设置店铺ID
         */
        private String mallId;

        /**
         * 设置店铺名
         */
        private String mallName;

        /**
         * 设置店铺地址
         */
        private String adress;

        /**
         * 设置店铺电话
         */
        private Integer phone;

        /**
         * 设置店铺备注
         */
        private String remark;
    }

}
