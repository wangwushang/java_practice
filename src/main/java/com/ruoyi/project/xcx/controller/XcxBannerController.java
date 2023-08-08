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
import com.ruoyi.project.xcx.domain.XcxBanner;
import com.ruoyi.project.xcx.service.IXcxBannerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * banner图Controller
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@RestController
@RequestMapping("/xcx/banner")
public class XcxBannerController extends BaseController
{
    @Autowired
    private IXcxBannerService xcxBannerService;

    /**
     * 查询banner图列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxBanner xcxBanner)
    {
        startPage();
        List<XcxBanner> list = xcxBannerService.selectXcxBannerList(xcxBanner);
        return getDataTable(list);
    }

    /**
     * 导出banner图列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:export')")
    @Log(title = "banner图", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxBanner xcxBanner)
    {
        List<XcxBanner> list = xcxBannerService.selectXcxBannerList(xcxBanner);
        ExcelUtil<XcxBanner> util = new ExcelUtil<XcxBanner>(XcxBanner.class);
        util.exportExcel(response, list, "banner图数据");
    }

    /**
     * 获取banner图详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxBannerService.selectXcxBannerById(id));
    }

    /**
     * 新增banner图
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:add')")
    @Log(title = "banner图", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxBanner xcxBanner)
    {
        return toAjax(xcxBannerService.insertXcxBanner(xcxBanner));
    }

    /**
     * 修改banner图
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:edit')")
    @Log(title = "banner图", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxBanner xcxBanner)
    {
        return toAjax(xcxBannerService.updateXcxBanner(xcxBanner));
    }

    /**
     * 删除banner图
     */
    @PreAuthorize("@ss.hasPermi('xcx:banner:remove')")
    @Log(title = "banner图", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxBannerService.deleteXcxBannerByIds(ids));
    }
}
