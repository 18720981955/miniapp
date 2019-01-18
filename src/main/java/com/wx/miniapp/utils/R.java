package com.wx.miniapp.utils;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;

import java.util.HashMap;
import java.util.Map;
/**
 * R
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 18:12
 */
public class R  extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public R(String openId,WxMaUserInfo userInfo) {
        put("code", 0);
        put("msg", "操作成功");
        put("openId",openId);
    }
    public R() {
        put("code", 0);
        put("msg", "操作成功");
    }
    public static R error() {
        return error(1, "操作失败");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public static R ok(String openId,WxMaUserInfo userInfo) {
        R r = new R();
        r.put("openId", openId);
        r.put("userInfo", userInfo);
        r.put("token",TokenUtils.createJwtToken(openId));
        return r;
    }
    public static R ok(WxMaUserInfo userInfo) {
        R r = new R();
        r.put("userInfo", userInfo);
        r.put("token",TokenUtils.createJwtToken(userInfo.getOpenId()));
        return r;
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
