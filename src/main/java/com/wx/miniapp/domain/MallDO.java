package com.wx.miniapp.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 店铺信息
 *
 * @author JackHu
 * @email 790327374@qq.com
 * @date 2018/11/21 19:53
 */
public class MallDO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 设置店铺ID
     */
    private Integer id;

    /**
     * 设置店铺名
     */
    private String name;

    /**
     * 设置店铺地址
     */
    private String adress;

    /**
     * 设置店铺电话
     */
    private String phone;

    /**
     * 设置店铺备注
     */
    private String remark;

    /**
     * 设置店铺图片类型
     */
    private Integer type;

    /**
     * 设置店铺图片路径
     */
    private String url;
    // 创建时间

    /**
     * 设置店铺创建时间
     */
    private Date createDate;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public MallDO() {
        super();
    }

    /***
     * 文件
     */

    public MallDO(Integer type,String url,Date createDate) {
        super();
        this.type = type;
        this.url = url;
        this.createDate = createDate;
    }

    public MallDO(Integer id,String name,String adress,String phone,String remark,Integer type,String url,Date createDate) {
        super();
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.remark = remark;
        this.type = type;
        this.url = url;
        this.createDate = createDate;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "MallDO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", adress='" + adress + '\'' +
            ", phone='" + phone + '\'' +
            ", remark='" + remark + '\'' +
            ", type=" + type +
            ", url='" + url + '\'' +
            ", createDate=" + createDate +
            '}';
    }
}
