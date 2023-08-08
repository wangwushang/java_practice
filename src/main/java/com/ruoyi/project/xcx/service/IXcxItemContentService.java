package com.ruoyi.project.xcx.service;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxItemContent;

/**
 * 首页itemService接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface IXcxItemContentService 
{
    /**
     * 查询首页item
     * 
     * @param id 首页item主键
     * @return 首页item
     */
    public XcxItemContent selectXcxItemContentById(Long id);

    /**
     * 查询首页item列表
     * 
     * @param xcxItemContent 首页item
     * @return 首页item集合
     */
    public List<XcxItemContent> selectXcxItemContentList(XcxItemContent xcxItemContent);

    /**
     * 新增首页item
     * 
     * @param xcxItemContent 首页item
     * @return 结果
     */
    public int insertXcxItemContent(XcxItemContent xcxItemContent);

    /**
     * 修改首页item
     * 
     * @param xcxItemContent 首页item
     * @return 结果
     */
    public int updateXcxItemContent(XcxItemContent xcxItemContent);

    /**
     * 批量删除首页item
     * 
     * @param ids 需要删除的首页item主键集合
     * @return 结果
     */
    public int deleteXcxItemContentByIds(Long[] ids);

    /**
     * 删除首页item信息
     * 
     * @param id 首页item主键
     * @return 结果
     */
    public int deleteXcxItemContentById(Long id);
}
