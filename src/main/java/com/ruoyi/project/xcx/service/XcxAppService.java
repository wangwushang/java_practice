package com.ruoyi.project.xcx.service;

import com.ruoyi.project.xcx.domain.vo.XcxHomeDataVO;
import com.ruoyi.project.xcx.domain.vo.XcxVideoDataVO;
import com.ruoyi.project.xcx.domain.vo.XcxVideoDetailDataVO;

public interface XcxAppService {
    XcxHomeDataVO getHomeResult();

    XcxVideoDataVO getVideoHomeResult();

    XcxVideoDetailDataVO getAppVideoDetailData(Long videoContentId);


}
