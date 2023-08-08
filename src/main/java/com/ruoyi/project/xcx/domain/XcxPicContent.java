package com.ruoyi.project.xcx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 图片对象 xcx_pic_content
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public class XcxPicContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 图片地址 */
    @Excel(name = "图片地址")
    private String picUrl;

    /** 状态：0未开启；1开启 */
    @Excel(name = "状态：0未开启；1开启")
    private String status;

    /** 图片标题 */
    @Excel(name = "图片标题")
    private String picTitle;

    /** 删除标志；0未删除；1删除 */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPicUrl(String picUrl) 
    {
        this.picUrl = picUrl;
    }

    public String getPicUrl() 
    {
        return picUrl;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setPicTitle(String picTitle) 
    {
        this.picTitle = picTitle;
    }

    public String getPicTitle() 
    {
        return picTitle;
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
            .append("picUrl", getPicUrl())
            .append("status", getStatus())
            .append("picTitle", getPicTitle())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
