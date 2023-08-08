package com.ruoyi.project.xcx.domain.vo;

import com.ruoyi.project.xcx.domain.XcxItemContent;
import com.ruoyi.project.xcx.domain.XcxPicContent;
import lombok.Data;

import java.util.List;

@Data
public class XcxHomeDataVO {
    private List<XcxItemContent> itemContentList;

    private List<XcxPicContent> picContentList;
}
