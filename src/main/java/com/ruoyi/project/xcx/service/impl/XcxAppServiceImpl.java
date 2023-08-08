package com.ruoyi.project.xcx.service.impl;

import com.ruoyi.project.xcx.domain.XcxBanner;
import com.ruoyi.project.xcx.domain.XcxItemContent;
import com.ruoyi.project.xcx.domain.XcxPicContent;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import com.ruoyi.project.xcx.domain.vo.XcxHomeDataVO;
import com.ruoyi.project.xcx.domain.vo.XcxVideoDataVO;
import com.ruoyi.project.xcx.domain.vo.XcxVideoDetailDataVO;
import com.ruoyi.project.xcx.mapper.XcxBannerMapper;
import com.ruoyi.project.xcx.mapper.XcxItemContentMapper;
import com.ruoyi.project.xcx.mapper.XcxPicContentMapper;
import com.ruoyi.project.xcx.mapper.XcxVideoContentMapper;
import com.ruoyi.project.xcx.service.XcxAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XcxAppServiceImpl implements XcxAppService {

    @Autowired
    private XcxItemContentMapper xcxItemContentMapper;

    @Autowired
    private XcxPicContentMapper xcxPicContentMapper;
    @Autowired
    private XcxVideoContentMapper xcxVideoContentMapper;
    @Autowired
    private XcxBannerMapper bannerMapper;
    @Override
    public XcxHomeDataVO getHomeResult() {
        XcxHomeDataVO xcxHomeDataVO = new XcxHomeDataVO();
        List<XcxItemContent> xcxItemContents = xcxItemContentMapper.selectXcxItemContentList(null);
        xcxHomeDataVO.setItemContentList(xcxItemContents);
        List<XcxPicContent> xcxPicContents = xcxPicContentMapper.selectXcxPicContentList(null);
        xcxHomeDataVO.setPicContentList(xcxPicContents);
        return xcxHomeDataVO;
    }

    @Override
    public XcxVideoDataVO getVideoHomeResult() {
        XcxVideoDataVO xcxVideoDataVO = new XcxVideoDataVO();
        //顶部banner图
        List<XcxBanner> xcxBanners = bannerMapper.selectXcxBannerList(null);
        xcxVideoDataVO.setBannerList(xcxBanners);
        //底部视频
        List<XcxVideoContent> xcxVideoContents = xcxVideoContentMapper.selectXcxVideoContentList(null);
        xcxVideoDataVO.setVideoContentList(xcxVideoContents);
        return xcxVideoDataVO;
    }

    @Override
    public XcxVideoDetailDataVO getAppVideoDetailData(Long videoContentId) {
        XcxVideoDetailDataVO videoDetailDataVO = xcxVideoContentMapper.getAppVideoDetailData(videoContentId);
        List<XcxVideoContent> xcxVideoContentList =  xcxVideoContentMapper.getLikeContent(videoContentId);
        videoDetailDataVO.setVideoContentList(xcxVideoContentList);
        return videoDetailDataVO;
    }
}
