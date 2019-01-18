package com.wx.miniapp.service;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.wx.miniapp.utils.R;


/**
 * 用户信息接口
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:20
 */
public interface UserService {
    int save(WxMaUserInfo user);
    WxMaUserInfo select(String openId);
}
