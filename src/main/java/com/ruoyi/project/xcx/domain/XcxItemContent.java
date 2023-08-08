package com.ruoyi.project.xcx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 首页item对象 xcx_item_content
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public class XcxItemContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** item的图片地址 */
    @Excel(name = "item的图片地址")
    private String itemUrl;

    /** 标题 */
    @Excel(name = "标题")
    private String itemTitle;

    /** 状态：0未开启;1开启 */
    @Excel(name = "状态：0未开启;1开启")
    private String status;

    /** 跳转地址 */
    @Excel(name = "跳转地址")
    private String toLinkUrl;

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
    public void setItemUrl(String itemUrl) 
    {
        this.itemUrl = itemUrl;
    }

    public String getItemUrl() 
    {
        return itemUrl;
    }
    public void setItemTitle(String itemTitle) 
    {
        this.itemTitle = itemTitle;
    }

    public String getItemTitle() 
    {
        return itemTitle;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setToLinkUrl(String toLinkUrl) 
    {
        this.toLinkUrl = toLinkUrl;
    }

    public String getToLinkUrl() 
    {
        return toLinkUrl;
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
            .append("itemUrl", getItemUrl())
            .append("itemTitle", getItemTitle())
            .append("status", getStatus())
            .append("toLinkUrl", getToLinkUrl())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
