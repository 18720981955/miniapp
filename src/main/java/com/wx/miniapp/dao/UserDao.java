package com.wx.miniapp.dao;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户信息DAO
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:18
 */
@Mapper
public interface UserDao {

    int save(WxMaUserInfo user);

    WxMaUserInfo select(String openId);

}
