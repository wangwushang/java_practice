package com.ruoyi.project.xcx.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.xcx.mapper.XcxPicContentMapper;
import com.ruoyi.project.xcx.service.XcxAppService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/xcx/app")
public class XcxAppController {
    @Resource
    private XcxAppService xcxAppService;

    @GetMapping("/getAppHomeData")
    @Operation(summary = "获得App首页数据")
    public AjaxResult getHomeResult(){
      return AjaxResult.success(xcxAppService.getHomeResult());
    }

    @GetMapping("/getAppVideoData")
    @Operation(summary = "获得视频首页数据")
    public AjaxResult getVideoHomeResult(){
        return AjaxResult.success(xcxAppService.getVideoHomeResult());
    }

    @GetMapping("/getAppVideoDetailData")
    @Operation(summary = "获得视频首页数据")
    public AjaxResult getAppVideoDetailData(@RequestParam("videoContentId") Long videoContentId){
        return AjaxResult.success(xcxAppService.getAppVideoDetailData(videoContentId));
    }

}
