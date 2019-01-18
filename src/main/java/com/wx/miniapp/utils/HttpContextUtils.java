package com.wx.miniapp.utils;

/**
 * HttpContextUtils
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2019/1/8 15:04
 */

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class HttpContextUtils {
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}

