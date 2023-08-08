package com.ruoyi.project.xcx.mapper;

import java.util.List;
import com.ruoyi.project.xcx.domain.XcxVideoContent;
import com.ruoyi.project.xcx.domain.vo.XcxVideoDetailDataVO;
import org.springframework.data.repository.query.Param;

/**
 * 视频目录Mapper接口
 * 
 * @author ruoyi
 * @date 2023-07-13
 */
public interface XcxVideoContentMapper 
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
     * 删除视频目录
     * 
     * @param id 视频目录主键
     * @return 结果
     */
    public int deleteXcxVideoContentById(Long id);

    /**
     * 批量删除视频目录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteXcxVideoContentByIds(Long[] ids);


    XcxVideoDetailDataVO getAppVideoDetailData(@Param("videoContentId") Long videoContentId);

    List<XcxVideoContent> getLikeContent(Long videoContentId);


}
