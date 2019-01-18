package com.wx.miniapp.service.impl;

import com.wx.miniapp.dao.MallDao;
import com.wx.miniapp.domain.MallDO;
import com.wx.miniapp.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 商品信息接口Imp
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:21
 */
@Service
public class MallServiceImpl implements MallService {
    @Autowired
    private MallDao mallMapper;

    @Override
    public MallDO get(Long id){
        return mallMapper.get(id);
    }

    @Override
    public List<MallDO> list(Map<String, Object> map){
        return mallMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return mallMapper.count(map);
    }

    @Override
    public int save(MallDO sysFile){
        return mallMapper.save(sysFile);
    }

    @Override
    public int update(MallDO sysFile){
        return mallMapper.update(sysFile);
    }

    @Override
    public int remove(Long id){
        return mallMapper.remove(id);
    }

    @Override
    public int batchRemove(Long[] ids){
        return mallMapper.batchRemove(ids);
    }
}
