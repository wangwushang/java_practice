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
import com.ruoyi.project.xcx.domain.XcxPicContent;
import com.ruoyi.project.xcx.service.IXcxPicContentService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 图片Controller
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@RestController
@RequestMapping("/xcx/picContent")
public class XcxPicContentController extends BaseController
{
    @Autowired
    private IXcxPicContentService xcxPicContentService;

    /**
     * 查询图片列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxPicContent xcxPicContent)
    {
        startPage();
        List<XcxPicContent> list = xcxPicContentService.selectXcxPicContentList(xcxPicContent);
        return getDataTable(list);
    }

    /**
     * 导出图片列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:export')")
    @Log(title = "图片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxPicContent xcxPicContent)
    {
        List<XcxPicContent> list = xcxPicContentService.selectXcxPicContentList(xcxPicContent);
        ExcelUtil<XcxPicContent> util = new ExcelUtil<XcxPicContent>(XcxPicContent.class);
        util.exportExcel(response, list, "图片数据");
    }

    /**
     * 获取图片详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxPicContentService.selectXcxPicContentById(id));
    }

    /**
     * 新增图片
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:add')")
    @Log(title = "图片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxPicContent xcxPicContent)
    {
        return toAjax(xcxPicContentService.insertXcxPicContent(xcxPicContent));
    }

    /**
     * 修改图片
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:edit')")
    @Log(title = "图片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxPicContent xcxPicContent)
    {
        return toAjax(xcxPicContentService.updateXcxPicContent(xcxPicContent));
    }

    /**
     * 删除图片
     */
    @PreAuthorize("@ss.hasPermi('xcx:picContent:remove')")
    @Log(title = "图片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxPicContentService.deleteXcxPicContentByIds(ids));
    }
}
