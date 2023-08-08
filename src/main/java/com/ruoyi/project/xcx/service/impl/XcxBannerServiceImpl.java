package com.ruoyi.project.xcx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.xcx.mapper.XcxBannerMapper;
import com.ruoyi.project.xcx.domain.XcxBanner;
import com.ruoyi.project.xcx.service.IXcxBannerService;

/**
 * banner图Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
@Service
public class XcxBannerServiceImpl implements IXcxBannerService 
{
    @Autowired
    private XcxBannerMapper xcxBannerMapper;

    /**
     * 查询banner图
     * 
     * @param id banner图主键
     * @return banner图
     */
    @Override
    public XcxBanner selectXcxBannerById(Long id)
    {
        return xcxBannerMapper.selectXcxBannerById(id);
    }

    /**
     * 查询banner图列表
     * 
     * @param xcxBanner banner图
     * @return banner图
     */
    @Override
    public List<XcxBanner> selectXcxBannerList(XcxBanner xcxBanner)
    {
        return xcxBannerMapper.selectXcxBannerList(xcxBanner);
    }

    /**
     * 新增banner图
     * 
     * @param xcxBanner banner图
     * @return 结果
     */
    @Override
    public int insertXcxBanner(XcxBanner xcxBanner)
    {
        xcxBanner.setCreateTime(DateUtils.getNowDate());
        return xcxBannerMapper.insertXcxBanner(xcxBanner);
    }

    /**
     * 修改banner图
     * 
     * @param xcxBanner banner图
     * @return 结果
     */
    @Override
    public int updateXcxBanner(XcxBanner xcxBanner)
    {
        xcxBanner.setUpdateTime(DateUtils.getNowDate());
        return xcxBannerMapper.updateXcxBanner(xcxBanner);
    }

    /**
     * 批量删除banner图
     * 
     * @param ids 需要删除的banner图主键
     * @return 结果
     */
    @Override
    public int deleteXcxBannerByIds(Long[] ids)
    {
        return xcxBannerMapper.deleteXcxBannerByIds(ids);
    }

    /**
     * 删除banner图信息
     * 
     * @param id banner图主键
     * @return 结果
     */
    @Override
    public int deleteXcxBannerById(Long id)
    {
        return xcxBannerMapper.deleteXcxBannerById(id);
    }
}
