package com.wx.miniapp.dao;

import com.wx.miniapp.domain.MallDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品信息DAO
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:18
 */
@Mapper
public interface MallDao{

    MallDO get(Long id);

    List<MallDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(MallDO file);

    int update(MallDO file);

    int remove(Long id);

    int batchRemove(Long[] ids);
}
