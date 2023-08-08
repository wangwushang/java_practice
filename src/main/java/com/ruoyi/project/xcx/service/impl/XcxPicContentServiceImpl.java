package com.ruoyi.project.xcx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.xcx.mapper.XcxPicContentMapper;
import com.ruoyi.project.xcx.domain.XcxPicContent;
import com.ruoyi.project.xcx.service.IXcxPicContentService;

/**
 * 图片Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@Service
public class XcxPicContentServiceImpl implements IXcxPicContentService 
{
    @Autowired
    private XcxPicContentMapper xcxPicContentMapper;

    /**
     * 查询图片
     * 
     * @param id 图片主键
     * @return 图片
     */
    @Override
    public XcxPicContent selectXcxPicContentById(Long id)
    {
        return xcxPicContentMapper.selectXcxPicContentById(id);
    }

    /**
     * 查询图片列表
     * 
     * @param xcxPicContent 图片
     * @return 图片
     */
    @Override
    public List<XcxPicContent> selectXcxPicContentList(XcxPicContent xcxPicContent)
    {
        return xcxPicContentMapper.selectXcxPicContentList(xcxPicContent);
    }

    /**
     * 新增图片
     * 
     * @param xcxPicContent 图片
     * @return 结果
     */
    @Override
    public int insertXcxPicContent(XcxPicContent xcxPicContent)
    {
        xcxPicContent.setCreateTime(DateUtils.getNowDate());
        return xcxPicContentMapper.insertXcxPicContent(xcxPicContent);
    }

    /**
     * 修改图片
     * 
     * @param xcxPicContent 图片
     * @return 结果
     */
    @Override
    public int updateXcxPicContent(XcxPicContent xcxPicContent)
    {
        xcxPicContent.setUpdateTime(DateUtils.getNowDate());
        return xcxPicContentMapper.updateXcxPicContent(xcxPicContent);
    }

    /**
     * 批量删除图片
     * 
     * @param ids 需要删除的图片主键
     * @return 结果
     */
    @Override
    public int deleteXcxPicContentByIds(Long[] ids)
    {
        return xcxPicContentMapper.deleteXcxPicContentByIds(ids);
    }

    /**
     * 删除图片信息
     * 
     * @param id 图片主键
     * @return 结果
     */
    @Override
    public int deleteXcxPicContentById(Long id)
    {
        return xcxPicContentMapper.deleteXcxPicContentById(id);
    }
}
