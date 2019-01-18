package com.wx.miniapp.service.impl;

import cn.binarywang.wx.miniapp.bean.WxMaUserInfo;
import com.wx.miniapp.dao.UserDao;
import com.wx.miniapp.domain.UserDO;
import com.wx.miniapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 商品信息接口Imp
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userMapper;

    @Override
    @Cacheable(value = "openId",key="#openId")
    public WxMaUserInfo select(String openId){
        return userMapper.select(openId);
    }

    @Override
    @CacheEvict(value="openId",key="#user.openId" )
    public int save(WxMaUserInfo user){
        return userMapper.save(user);
    }
}
