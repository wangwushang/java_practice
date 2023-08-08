package com.ruoyi.project.xcx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 视频目录对象 xcx_video_content
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public class XcxVideoContent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 视频封面地址 */
    @Excel(name = "视频封面地址")
    private String videoPicUrl;

    /** 视频简介 */
    @Excel(name = "视频简介")
    private String videoDetail;

    /** 视频标题 */
    @Excel(name = "视频标题")
    private String videoTitle;

    /** 状态：0未开启；1开启 */
    @Excel(name = "状态：0未开启；1开启")
    private String status;

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
    public void setVideoPicUrl(String videoPicUrl) 
    {
        this.videoPicUrl = videoPicUrl;
    }

    public String getVideoPicUrl() 
    {
        return videoPicUrl;
    }
    public void setVideoDetail(String videoDetail) 
    {
        this.videoDetail = videoDetail;
    }

    public String getVideoDetail() 
    {
        return videoDetail;
    }
    public void setVideoTitle(String videoTitle) 
    {
        this.videoTitle = videoTitle;
    }

    public String getVideoTitle() 
    {
        return videoTitle;
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
            .append("videoPicUrl", getVideoPicUrl())
            .append("videoDetail", getVideoDetail())
            .append("videoTitle", getVideoTitle())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
