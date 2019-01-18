package com.wx.miniapp.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 2
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/22 14:54
 */

public class PageUtil implements Serializable {
    private static final long serialVersionUID = 1L;
    private int total;
    private List<?> rows;

    public PageUtil(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
