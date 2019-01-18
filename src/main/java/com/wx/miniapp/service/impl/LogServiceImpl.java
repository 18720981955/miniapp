package com.wx.miniapp.service.impl;

import java.util.List;

import com.wx.miniapp.dao.LogDao;
import com.wx.miniapp.domain.LogDO;
import com.wx.miniapp.domain.PageDO;
import com.wx.miniapp.service.LogService;
import com.wx.miniapp.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
/**
 * LogServiceImpl
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2019/1/8 15:20
 */

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    LogDao logMapper;

    @Async
    @Override
    public void save(LogDO logDO) {
        logMapper.save(logDO);
    }

    @Override
    public PageDO<LogDO> queryList(Query query) {
        int total = logMapper.count(query);
        List<LogDO> logs = logMapper.list(query);
        PageDO<LogDO> page = new PageDO<>();
        page.setTotal(total);
        page.setRows(logs);
        return page;
    }

    @Override
    public int remove(Long id) {
        int count = logMapper.remove(id);
        return count;
    }

    @Override
    public int batchRemove(Long[] ids){
        return logMapper.batchRemove(ids);
    }
}

