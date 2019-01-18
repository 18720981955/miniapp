package com.wx.miniapp.service;

import com.wx.miniapp.domain.MallDO;

import java.util.List;
import java.util.Map;

/**
 * 商品信息接口
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 10:20
 */
public interface MallService {
    MallDO get(Long id);

    List<MallDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);

    int save(MallDO mall);

    int update(MallDO mall);

    int remove(Long id);

    int batchRemove(Long[] ids);
}
