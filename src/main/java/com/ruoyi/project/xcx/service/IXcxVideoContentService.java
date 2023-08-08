package com.ruoyi.project.xcx.service;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxVideoContent;

/**
 * 视频目录Service接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface IXcxVideoContentService 
{
    /**
     * 查询视频目录
     * 
     * @param id 视频目录主键
     * @return 视频目录
     */
    public XcxVideoContent selectXcxVideoContentById(Long id);

    /**
     * 查询视频目录列表
     * 
     * @param xcxVideoContent 视频目录
     * @return 视频目录集合
     */
    public List<XcxVideoContent> selectXcxVideoContentList(XcxVideoContent xcxVideoContent);

    /**
     * 新增视频目录
     * 
     * @param xcxVideoContent 视频目录
     * @return 结果
     */
    public int insertXcxVideoContent(XcxVideoContent xcxVideoContent);

    /**
     * 修改视频目录
     * 
     * @param xcxVideoContent 视频目录
     * @return 结果
     */
    public int updateXcxVideoContent(XcxVideoContent xcxVideoContent);

    /**
     * 批量删除视频目录
     * 
     * @param ids 需要删除的视频目录主键集合
     * @return 结果
     */
    public int deleteXcxVideoContentByIds(Long[] ids);

    /**
     * 删除视频目录信息
     * 
     * @param id 视频目录主键
     * @return 结果
     */
    public int deleteXcxVideoContentById(Long id);
}
