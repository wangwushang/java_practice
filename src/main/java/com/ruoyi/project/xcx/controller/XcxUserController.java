package com.ruoyi.project.xcx.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.xcx.domain.XcxUser;
import com.ruoyi.project.xcx.service.IXcxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户Controller
 * 
 * @author ruoyi
 * @date 2023-07-07
 */
@RestController
@RequestMapping("/xcx/user")
public class XcxUserController extends BaseController
{
    @Autowired
    private IXcxUserService xcxUserService;

    /**
     * 用户列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:list')")
    @GetMapping("/list")
    public TableDataInfo list(XcxUser xcxUser)
    {
        startPage();
        List<XcxUser> list = xcxUserService.selectXcxUserList(xcxUser);
        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:export')")
    @Log(title = "用户列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, XcxUser xcxUser)
    {
        List<XcxUser> list = xcxUserService.selectXcxUserList(xcxUser);
        ExcelUtil<XcxUser> util = new ExcelUtil<XcxUser>(XcxUser.class);
        util.exportExcel(response, list, "用户数据");
    }

    /**
     * 获取用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(xcxUserService.selectXcxUserById(id));
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:add')")
    @Log(title = "新增用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody XcxUser xcxUser)
    {
        return toAjax(xcxUserService.insertXcxUser(xcxUser));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:edit')")
    @Log(title = "修改用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody XcxUser xcxUser)
    {
        return toAjax(xcxUserService.updateXcxUser(xcxUser));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:remove')")
    @Log(title = "删除用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(xcxUserService.deleteXcxUserByIds(ids));
    }

    @PreAuthorize("@ss.hasPermi('xcx:xcxuser:edit')")
    @Log(title = "修改用户账号状态", businessType = BusinessType.UPDATE)
    @PutMapping("/changeStatus")
    public AjaxResult changeStatus(@RequestBody XcxUser user)
    {
        user.setUpdateBy(getUsername());
        return toAjax(xcxUserService.updateUserStatus(user));
    }
}
