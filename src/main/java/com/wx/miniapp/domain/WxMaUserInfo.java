package com.wx.miniapp.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * WXUSER
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/12/5 11:24
 */
@Data
public class WxMaUserInfo implements Serializable{

        private static final long serialVersionUID = 6719822331555402137L;

        private String openId;
        private String nickName;
        private String gender;
        private String language;
        private String city;
        private String province;
        private String country;
        private String avatarUrl;
        private String unionId;
        private Watermark watermark;

        @Data
        public static class Watermark implements Serializable{
            private static final long serialVersionUID = 6719822331555402137L;
            private String timestamp;
            private String appid;
        }
}
