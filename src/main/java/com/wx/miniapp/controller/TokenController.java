package com.wx.miniapp.controller;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.wx.miniapp.annotation.CurrentUser;
import com.wx.miniapp.annotation.LoginRequired;
import com.wx.miniapp.service.UserService;
import com.wx.miniapp.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * user token
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/12/27 16:50
 * token获取url
 */
@Slf4j
@RestController
public class TokenController {
    @Resource
    UserService userService;


    @LoginRequired
    @RequestMapping(value = "/token")
    public R token(@CurrentUser WxMaUserInfo userBase) {
        log.info("params==" + userBase.toString());
            WxMaUserInfo result = null;
            result = userService.select(userBase.getOpenId());
            if (result == null) {
                return R.error("未查询到账号信息");
            } else {
                return R.ok(result);
            }
    }
}
