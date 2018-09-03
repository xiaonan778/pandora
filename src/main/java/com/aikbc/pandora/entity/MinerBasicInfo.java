package com.aikbc.pandora.entity;

import java.io.Serializable;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 矿机基础信息
 * </p>
 *
 * @author CJay123
 * @since 2018-09-03
 */
@TableName("miner_basic_info")
public class MinerBasicInfo extends Model<MinerBasicInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * MAC地址
     */
    private String mac;
    /**
     * IP
     */
    private String ip;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MinerBasicInfo{" +
        ", id=" + id +
        ", mac=" + mac +
        ", ip=" + ip +
        ", createTime=" + createTime +
        "}";
    }
}
