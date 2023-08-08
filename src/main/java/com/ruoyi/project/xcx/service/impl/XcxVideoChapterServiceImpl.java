package com.ruoyi.project.xcx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.xcx.mapper.XcxVideoChapterMapper;
import com.ruoyi.project.xcx.domain.XcxVideoChapter;
import com.ruoyi.project.xcx.service.IXcxVideoChapterService;

/**
 * 视频章节Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@Service
public class XcxVideoChapterServiceImpl implements IXcxVideoChapterService 
{
    @Autowired
    private XcxVideoChapterMapper xcxVideoChapterMapper;

    /**
     * 查询视频章节
     * 
     * @param id 视频章节主键
     * @return 视频章节
     */
    @Override
    public XcxVideoChapter selectXcxVideoChapterById(Long id)
    {
        return xcxVideoChapterMapper.selectXcxVideoChapterById(id);
    }

    /**
     * 查询视频章节列表
     * 
     * @param xcxVideoChapter 视频章节
     * @return 视频章节
     */
    @Override
    public List<XcxVideoChapter> selectXcxVideoChapterList(XcxVideoChapter xcxVideoChapter)
    {
        return xcxVideoChapterMapper.selectXcxVideoChapterList(xcxVideoChapter);
    }

    /**
     * 新增视频章节
     * 
     * @param xcxVideoChapter 视频章节
     * @return 结果
     */
    @Override
    public int insertXcxVideoChapter(XcxVideoChapter xcxVideoChapter)
    {
        xcxVideoChapter.setCreateTime(DateUtils.getNowDate());
        return xcxVideoChapterMapper.insertXcxVideoChapter(xcxVideoChapter);
    }

    /**
     * 修改视频章节
     * 
     * @param xcxVideoChapter 视频章节
     * @return 结果
     */
    @Override
    public int updateXcxVideoChapter(XcxVideoChapter xcxVideoChapter)
    {
        xcxVideoChapter.setUpdateTime(DateUtils.getNowDate());
        return xcxVideoChapterMapper.updateXcxVideoChapter(xcxVideoChapter);
    }

    /**
     * 批量删除视频章节
     * 
     * @param ids 需要删除的视频章节主键
     * @return 结果
     */
    @Override
    public int deleteXcxVideoChapterByIds(Long[] ids)
    {
        return xcxVideoChapterMapper.deleteXcxVideoChapterByIds(ids);
    }

    /**
     * 删除视频章节信息
     * 
     * @param id 视频章节主键
     * @return 结果
     */
    @Override
    public int deleteXcxVideoChapterById(Long id)
    {
        return xcxVideoChapterMapper.deleteXcxVideoChapterById(id);
    }
}
