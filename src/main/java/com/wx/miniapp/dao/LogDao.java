package com.wx.miniapp.dao;

import com.wx.miniapp.domain.LogDO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * LogDao
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2019/1/8 15:21
 */
@Mapper
public interface LogDao {

    LogDO get(Long id);

    List<LogDO> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(LogDO log);

    int update(LogDO log);

    int remove(Long id);

    int batchRemove(Long[] ids);
}
