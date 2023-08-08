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
import com.ruoyi.project.xcx.domain.XcxItemContent;
import com.ruoyi.project.xcx.service.IXcxItemContentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 首页itemController
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@RestController
@RequestMapping("/xcx/itemContent")
public class XcxItemContentController extends BaseController
{
    @Autowired
    private IXcxItemContentService xcxItemContentService;

    /**
     * 查询首页item列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxItemContent xcxItemContent)
    {
        startPage();
        List<XcxItemContent> list = xcxItemContentService.selectXcxItemContentList(xcxItemContent);
        return getDataTable(list);
    }

    /**
     * 导出首页item列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:export')")
    @Log(title = "首页item", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxItemContent xcxItemContent)
    {
        List<XcxItemContent> list = xcxItemContentService.selectXcxItemContentList(xcxItemContent);
        ExcelUtil<XcxItemContent> util = new ExcelUtil<XcxItemContent>(XcxItemContent.class);
        util.exportExcel(response, list, "首页item数据");
    }

    /**
     * 获取首页item详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxItemContentService.selectXcxItemContentById(id));
    }

    /**
     * 新增首页item
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:add')")
    @Log(title = "首页item", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxItemContent xcxItemContent)
    {
        return toAjax(xcxItemContentService.insertXcxItemContent(xcxItemContent));
    }

    /**
     * 修改首页item
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:edit')")
    @Log(title = "首页item", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxItemContent xcxItemContent)
    {
        return toAjax(xcxItemContentService.updateXcxItemContent(xcxItemContent));
    }

    /**
     * 删除首页item
     */
    @PreAuthorize("@ss.hasPermi('xcx:itemContent:remove')")
    @Log(title = "首页item", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxItemContentService.deleteXcxItemContentByIds(ids));
    }
}
