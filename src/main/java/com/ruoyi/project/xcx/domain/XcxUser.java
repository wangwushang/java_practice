package com.ruoyi.project.xcx.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 【请填写功能名称】对象 xcx_user
 * 
 * @author ruoyi
 * @date 2023-07-07
 */
public class XcxUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String username;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 图像地址 */
    @Excel(name = "图像地址")
    private String avterUrl;

    /** 推广码 */
    @Excel(name = "推广码")
    private String tgCode;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idcard;

    /** 状态：0未开启;1开启 */
    @Excel(name = "状态：0未开启;1开启")
    private String status;

    /** 删除标记 0未删除；1删除 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAvterUrl(String avterUrl) 
    {
        this.avterUrl = avterUrl;
    }

    public String getAvterUrl() 
    {
        return avterUrl;
    }
    public void setTgCode(String tgCode) 
    {
        this.tgCode = tgCode;
    }

    public String getTgCode() 
    {
        return tgCode;
    }
    public void setIdcard(String idcard) 
    {
        this.idcard = idcard;
    }

    public String getIdcard() 
    {
        return idcard;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    public void setDelFlag(String delFlag)
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag()
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("phone", getPhone())
            .append("avterUrl", getAvterUrl())
            .append("tgCode", getTgCode())
            .append("idcard", getIdcard())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
