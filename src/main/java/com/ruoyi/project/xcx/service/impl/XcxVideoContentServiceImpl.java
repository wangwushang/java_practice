package com.ruoyi.project.xcx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.xcx.mapper.XcxVideoContentMapper;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import com.ruoyi.project.xcx.service.IXcxVideoContentService;

/**
 * 视频目录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@Service
public class XcxVideoContentServiceImpl implements IXcxVideoContentService 
{
    @Autowired
    private XcxVideoContentMapper xcxVideoContentMapper;

    /**
     * 查询视频目录
     * 
     * @param id 视频目录主键
     * @return 视频目录
     */
    @Override
    public XcxVideoContent selectXcxVideoContentById(Long id)
    {
        return xcxVideoContentMapper.selectXcxVideoContentById(id);
    }

    /**
     * 查询视频目录列表
     * 
     * @param xcxVideoContent 视频目录
     * @return 视频目录
     */
    @Override
    public List<XcxVideoContent> selectXcxVideoContentList(XcxVideoContent xcxVideoContent)
    {
        return xcxVideoContentMapper.selectXcxVideoContentList(xcxVideoContent);
    }

    /**
     * 新增视频目录
     * 
     * @param xcxVideoContent 视频目录
     * @return 结果
     */
    @Override
    public int insertXcxVideoContent(XcxVideoContent xcxVideoContent)
    {
        xcxVideoContent.setCreateTime(DateUtils.getNowDate());
        return xcxVideoContentMapper.insertXcxVideoContent(xcxVideoContent);
    }

    /**
     * 修改视频目录
     * 
     * @param xcxVideoContent 视频目录
     * @return 结果
     */
    @Override
    public int updateXcxVideoContent(XcxVideoContent xcxVideoContent)
    {
        xcxVideoContent.setUpdateTime(DateUtils.getNowDate());
        return xcxVideoContentMapper.updateXcxVideoContent(xcxVideoContent);
    }

    /**
     * 批量删除视频目录
     * 
     * @param ids 需要删除的视频目录主键
     * @return 结果
     */
    @Override
    public int deleteXcxVideoContentByIds(Long[] ids)
    {
        return xcxVideoContentMapper.deleteXcxVideoContentByIds(ids);
    }

    /**
     * 删除视频目录信息
     * 
     * @param id 视频目录主键
     * @return 结果
     */
    @Override
    public int deleteXcxVideoContentById(Long id)
    {
        return xcxVideoContentMapper.deleteXcxVideoContentById(id);
    }
}
