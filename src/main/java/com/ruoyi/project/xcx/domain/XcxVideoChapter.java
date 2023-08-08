package com.ruoyi.project.xcx.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 视频章节对象 xcx_video_chapter
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public class XcxVideoChapter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 视频目录表id */
    @Excel(name = "视频目录表id")
    private Long videoId;

    /** 章节标题 */
    @Excel(name = "章节标题")
    private String chapterTitle;

    /** 章节视频url */
    @Excel(name = "章节视频url")
    private String chapterUrl;

    /** 章节数 */
    @Excel(name = "章节数")
    private String chapterNum;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
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
    public void setVideoId(Long videoId) 
    {
        this.videoId = videoId;
    }

    public Long getVideoId() 
    {
        return videoId;
    }
    public void setChapterTitle(String chapterTitle) 
    {
        this.chapterTitle = chapterTitle;
    }

    public String getChapterTitle() 
    {
        return chapterTitle;
    }
    public void setChapterUrl(String chapterUrl) 
    {
        this.chapterUrl = chapterUrl;
    }

    public String getChapterUrl() 
    {
        return chapterUrl;
    }
    public void setChapterNum(String chapterNum) 
    {
        this.chapterNum = chapterNum;
    }

    public String getChapterNum() 
    {
        return chapterNum;
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
            .append("videoId", getVideoId())
            .append("chapterTitle", getChapterTitle())
            .append("chapterUrl", getChapterUrl())
            .append("chapterNum", getChapterNum())
            .append("status", getStatus())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
