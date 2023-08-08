package com.ruoyi.project.xcx.mapper;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxBanner;

/**
 * banner图Mapper接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface XcxBannerMapper 
{
    /**
     * 查询banner图
     * 
     * @param id banner图主键
     * @return banner图
     */
    public XcxBanner selectXcxBannerById(Long id);

    /**
     * 查询banner图列表
     * 
     * @param xcxBanner banner图
     * @return banner图集合
     */
    public List<XcxBanner> selectXcxBannerList(XcxBanner xcxBanner);

    /**
     * 新增banner图
     * 
     * @param xcxBanner banner图
     * @return 结果
     */
    public int insertXcxBanner(XcxBanner xcxBanner);

    /**
     * 修改banner图
     * 
     * @param xcxBanner banner图
     * @return 结果
     */
    public int updateXcxBanner(XcxBanner xcxBanner);

    /**
     * 删除banner图
     * 
     * @param id banner图主键
     * @return 结果
     */
    public int deleteXcxBannerById(Long id);

    /**
     * 批量删除banner图
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXcxBannerByIds(Long[] ids);
}
