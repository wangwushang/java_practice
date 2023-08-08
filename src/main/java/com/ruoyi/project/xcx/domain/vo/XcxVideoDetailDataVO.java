package com.ruoyi.project.xcx.domain.vo;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.project.xcx.domain.XcxVideoChapter;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import lombok.Data;

import java.util.List;

@Data
public class XcxVideoDetailDataVO {
    private Long id;
    private String videoPicUrl;
    private String videoDetail;
    private String videoTitle;
    private List<XcxVideoChapter> videoChapterList;
    private List<XcxVideoContent> videoContentList;
}
