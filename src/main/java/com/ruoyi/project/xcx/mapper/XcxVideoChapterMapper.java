package com.ruoyi.project.xcx.mapper;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxVideoChapter;

/**
 * 视频章节Mapper接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface XcxVideoChapterMapper 
{
    /**
     * 查询视频章节
     * 
     * @param id 视频章节主键
     * @return 视频章节
     */
    public XcxVideoChapter selectXcxVideoChapterById(Long id);

    /**
     * 查询视频章节列表
     * 
     * @param xcxVideoChapter 视频章节
     * @return 视频章节集合
     */
    public List<XcxVideoChapter> selectXcxVideoChapterList(XcxVideoChapter xcxVideoChapter);

    /**
     * 新增视频章节
     * 
     * @param xcxVideoChapter 视频章节
     * @return 结果
     */
    public int insertXcxVideoChapter(XcxVideoChapter xcxVideoChapter);

    /**
     * 修改视频章节
     * 
     * @param xcxVideoChapter 视频章节
     * @return 结果
     */
    public int updateXcxVideoChapter(XcxVideoChapter xcxVideoChapter);

    /**
     * 删除视频章节
     * 
     * @param id 视频章节主键
     * @return 结果
     */
    public int deleteXcxVideoChapterById(Long id);

    /**
     * 批量删除视频章节
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXcxVideoChapterByIds(Long[] ids);
}
