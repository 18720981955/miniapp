package com.wx.miniapp.service;

/**
 * LogService
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2019/1/8 14:40
 */

import java.util.List;

import com.wx.miniapp.domain.LogDO;
import com.wx.miniapp.domain.PageDO;
import com.wx.miniapp.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    void save(LogDO logDO);
    PageDO<LogDO> queryList(Query query);
    int remove(Long id);
    int batchRemove(Long[] ids);
}
