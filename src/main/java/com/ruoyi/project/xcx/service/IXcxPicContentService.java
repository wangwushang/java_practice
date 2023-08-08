package com.ruoyi.project.xcx.service;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxPicContent;

/**
 * 图片Service接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface IXcxPicContentService 
{
    /**
     * 查询图片
     * 
     * @param id 图片主键
     * @return 图片
     */
    public XcxPicContent selectXcxPicContentById(Long id);

    /**
     * 查询图片列表
     * 
     * @param xcxPicContent 图片
     * @return 图片集合
     */
    public List<XcxPicContent> selectXcxPicContentList(XcxPicContent xcxPicContent);

    /**
     * 新增图片
     * 
     * @param xcxPicContent 图片
     * @return 结果
     */
    public int insertXcxPicContent(XcxPicContent xcxPicContent);

    /**
     * 修改图片
     * 
     * @param xcxPicContent 图片
     * @return 结果
     */
    public int updateXcxPicContent(XcxPicContent xcxPicContent);

    /**
     * 批量删除图片
     * 
     * @param ids 需要删除的图片主键集合
     * @return 结果
     */
    public int deleteXcxPicContentByIds(Long[] ids);

    /**
     * 删除图片信息
     * 
     * @param id 图片主键
     * @return 结果
     */
    public int deleteXcxPicContentById(Long id);
}
