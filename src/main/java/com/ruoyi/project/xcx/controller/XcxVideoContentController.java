package com.ruoyi.project.xcx.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import com.ruoyi.project.xcx.service.IXcxVideoContentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 视频目录Controller
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@RestController
@RequestMapping("/xcx/videoContent")
public class XcxVideoContentController extends BaseController
{
    @Autowired
    private IXcxVideoContentService xcxVideoContentService;

    /**
     * 查询视频目录列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxVideoContent xcxVideoContent)
    {
        startPage();
        List<XcxVideoContent> list = xcxVideoContentService.selectXcxVideoContentList(xcxVideoContent);
        return getDataTable(list);
    }

    /**
     * 导出视频目录列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:export')")
    @Log(title = "视频目录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxVideoContent xcxVideoContent)
    {
        List<XcxVideoContent> list = xcxVideoContentService.selectXcxVideoContentList(xcxVideoContent);
        ExcelUtil<XcxVideoContent> util = new ExcelUtil<XcxVideoContent>(XcxVideoContent.class);
        util.exportExcel(response, list, "视频目录数据");
    }

    /**
     * 获取视频目录详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxVideoContentService.selectXcxVideoContentById(id));
    }

    /**
     * 新增视频目录
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:add')")
    @Log(title = "视频目录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxVideoContent xcxVideoContent)
    {
        return toAjax(xcxVideoContentService.insertXcxVideoContent(xcxVideoContent));
    }

    /**
     * 修改视频目录
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:edit')")
    @Log(title = "视频目录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxVideoContent xcxVideoContent)
    {
        return toAjax(xcxVideoContentService.updateXcxVideoContent(xcxVideoContent));
    }

    /**
     * 删除视频目录
     */
    @PreAuthorize("@ss.hasPermi('xcx:videocontent:remove')")
    @Log(title = "视频目录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxVideoContentService.deleteXcxVideoContentByIds(ids));
    }
}
