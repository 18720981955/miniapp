package com.wx.miniapp.handler;

import com.wx.miniapp.bean.WxMaUserInfo;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.mybatis.spring.annotation.MapperScan;
import cn.binarywang.wx.miniapp.bean.WxMaUserInfo.Watermark;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/18 15:20
 * mybaits自定义字段类型
 */
public class ExampleTypeHandler extends BaseTypeHandler<Watermark> {


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Watermark parameter, JdbcType jdbcType)
        throws SQLException {
        // TODO Auto-generated method stub
        ps.setString(i, parameter.toString());
    }

    @Override
    public Watermark getNullableResult(ResultSet rs, String columnName) throws SQLException {
        // TODO Auto-generated method stub
        return new Watermark();
    }

    @Override
    public Watermark getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        return new Watermark();
    }

    @Override
    public Watermark getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        // TODO Auto-generated method stub
        return new Watermark();
    }
}
