package com.ruoyi.project.xcx.service;

import com.ruoyi.project.xcx.domain.XcxUser;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-07-07
 */
public interface IXcxUserService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public XcxUser selectXcxUserById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<XcxUser> selectXcxUserList(XcxUser xcxUser);

    /**
     * 新增【请填写功能名称】
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 结果
     */
    public int insertXcxUser(XcxUser xcxUser);

    /**
     * 修改【请填写功能名称】
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 结果
     */
    public int updateXcxUser(XcxUser xcxUser);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteXcxUserByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteXcxUserById(Long id);

    /**
     * 修改用户启用状态
     * @param user
     * @return
     */
    int updateUserStatus(XcxUser user);
}
