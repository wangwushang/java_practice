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
import com.ruoyi.project.xcx.domain.XcxVideoChapter;
import com.ruoyi.project.xcx.service.IXcxVideoChapterService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 视频章节Controller
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@RestController
@RequestMapping("/xcx/videoChapter")
public class XcxVideoChapterController extends BaseController
{
    @Autowired
    private IXcxVideoChapterService xcxVideoChapterService;

    /**
     * 查询视频章节列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxVideoChapter xcxVideoChapter)
    {
        startPage();
        List<XcxVideoChapter> list = xcxVideoChapterService.selectXcxVideoChapterList(xcxVideoChapter);
        return getDataTable(list);
    }

    /**
     * 导出视频章节列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:export')")
    @Log(title = "视频章节", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxVideoChapter xcxVideoChapter)
    {
        List<XcxVideoChapter> list = xcxVideoChapterService.selectXcxVideoChapterList(xcxVideoChapter);
        ExcelUtil<XcxVideoChapter> util = new ExcelUtil<XcxVideoChapter>(XcxVideoChapter.class);
        util.exportExcel(response, list, "视频章节数据");
    }

    /**
     * 获取视频章节详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxVideoChapterService.selectXcxVideoChapterById(id));
    }

    /**
     * 新增视频章节
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:add')")
    @Log(title = "视频章节", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxVideoChapter xcxVideoChapter)
    {
        return toAjax(xcxVideoChapterService.insertXcxVideoChapter(xcxVideoChapter));
    }

    /**
     * 修改视频章节
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:edit')")
    @Log(title = "视频章节", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxVideoChapter xcxVideoChapter)
    {
        return toAjax(xcxVideoChapterService.updateXcxVideoChapter(xcxVideoChapter));
    }

    /**
     * 删除视频章节
     */
    @PreAuthorize("@ss.hasPermi('xcx:videochapter:remove')")
    @Log(title = "视频章节", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxVideoChapterService.deleteXcxVideoChapterByIds(ids));
    }
}
