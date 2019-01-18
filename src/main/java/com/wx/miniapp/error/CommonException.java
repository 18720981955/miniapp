package com.wx.miniapp.error;

import lombok.Data;

/**
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/12/04 16:30
 * @Description: 自定义异常
 */
@Data
public class CommonException extends RuntimeException {

    public CommonException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;
    private String msg;


}
