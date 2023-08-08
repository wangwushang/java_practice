package com.ruoyi.project.xcx.domain.vo;

import com.ruoyi.project.xcx.domain.XcxBanner;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import lombok.Data;

import java.util.List;

@Data
public class XcxVideoDataVO {
    private List<XcxBanner> bannerList;

    private List<XcxVideoContent> videoContentList;
}
