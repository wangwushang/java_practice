package com.ruoyi.project.xcx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.xcx.mapper.XcxItemContentMapper;
import com.ruoyi.project.xcx.domain.XcxItemContent;
import com.ruoyi.project.xcx.service.IXcxItemContentService;

/**
 * 首页itemService业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@Service
public class XcxItemContentServiceImpl implements IXcxItemContentService 
{
    @Autowired
    private XcxItemContentMapper xcxItemContentMapper;

    /**
     * 查询首页item
     * 
     * @param id 首页item主键
     * @return 首页item
     */
    @Override
    public XcxItemContent selectXcxItemContentById(Long id)
    {
        return xcxItemContentMapper.selectXcxItemContentById(id);
    }

    /**
     * 查询首页item列表
     * 
     * @param xcxItemContent 首页item
     * @return 首页item
     */
    @Override
    public List<XcxItemContent> selectXcxItemContentList(XcxItemContent xcxItemContent)
    {
        return xcxItemContentMapper.selectXcxItemContentList(xcxItemContent);
    }

    /**
     * 新增首页item
     * 
     * @param xcxItemContent 首页item
     * @return 结果
     */
    @Override
    public int insertXcxItemContent(XcxItemContent xcxItemContent)
    {
        xcxItemContent.setCreateTime(DateUtils.getNowDate());
        return xcxItemContentMapper.insertXcxItemContent(xcxItemContent);
    }

    /**
     * 修改首页item
     * 
     * @param xcxItemContent 首页item
     * @return 结果
     */
    @Override
    public int updateXcxItemContent(XcxItemContent xcxItemContent)
    {
        xcxItemContent.setUpdateTime(DateUtils.getNowDate());
        return xcxItemContentMapper.updateXcxItemContent(xcxItemContent);
    }

    /**
     * 批量删除首页item
     * 
     * @param ids 需要删除的首页item主键
     * @return 结果
     */
    @Override
    public int deleteXcxItemContentByIds(Long[] ids)
    {
        return xcxItemContentMapper.deleteXcxItemContentByIds(ids);
    }

    /**
     * 删除首页item信息
     * 
     * @param id 首页item主键
     * @return 结果
     */
    @Override
    public int deleteXcxItemContentById(Long id)
    {
        return xcxItemContentMapper.deleteXcxItemContentById(id);
    }
}
