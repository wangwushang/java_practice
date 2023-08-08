package com.ruoyi.project.xcx.service.impl;

import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.project.system.domain.SysUser;
import com.ruoyi.project.system.domain.SysUserRole;
import com.ruoyi.project.system.mapper.SysUserMapper;
import com.ruoyi.project.system.mapper.SysUserRoleMapper;
import com.ruoyi.project.xcx.domain.XcxUser;
import com.ruoyi.project.xcx.mapper.XcxUserMapper;
import com.ruoyi.project.xcx.service.IXcxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-07-07
 */
@Service
public class XcxUserServiceImpl implements IXcxUserService
{
    @Autowired
    private XcxUserMapper xcxUserMapper;

    @Autowired
    private SysUserMapper userMapper;

    @Resource
    private SysUserRoleMapper userRoleMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public XcxUser selectXcxUserById(Long id)
    {
        return xcxUserMapper.selectXcxUserById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<XcxUser> selectXcxUserList(XcxUser xcxUser)
    {
        return xcxUserMapper.selectXcxUserList(xcxUser);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    @Transactional
    public int insertXcxUser(XcxUser xcxUser)
    {
        xcxUser.setCreateTime(DateUtils.getNowDate());
        //插入用户表
        SysUser sysUser = new SysUser();
        sysUser.setUserName(xcxUser.getPhone());
        sysUser.setNickName(xcxUser.getUsername());
        sysUser.setAvatar(xcxUser.getAvterUrl());
        sysUser.setPhonenumber(xcxUser.getPhone());
        sysUser.setStatus("0");
        sysUser.setPassword(SecurityUtils.encryptPassword("ks"+xcxUser.getPhone()));
        userMapper.insertUser(sysUser);
        xcxUser.setId(sysUser.getUserId());
        //插入角色
        Long userId = sysUser.getUserId();
        SysUserRole sysUserRole = new SysUserRole();
        sysUserRole.setUserId(userId);
        sysUserRole.setRoleId(Long.valueOf(3));
        ArrayList<SysUserRole> objects = new ArrayList<>();
        objects.add(sysUserRole);
        userRoleMapper.batchUserRole(objects);
        //查询当前手机号是否存在
        String phone = xcxUser.getPhone();
        //判断用户表是否存在
        XcxUser user = xcxUserMapper.checkPhoneUnique(phone);
        SysUser sysUser1 = userMapper.checkPhoneUnique(phone);
        if (sysUser1 != null || user != null){
            throw new ServiceException("手机号已存在",10010);
        }
        return xcxUserMapper.insertXcxUser(xcxUser);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param xcxUser 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateXcxUser(XcxUser xcxUser)
    {
        xcxUser.setUpdateTime(DateUtils.getNowDate());
        return xcxUserMapper.updateXcxUser(xcxUser);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteXcxUserByIds(Long[] ids)
    {
        return xcxUserMapper.deleteXcxUserByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteXcxUserById(Long id)
    {
        return xcxUserMapper.deleteXcxUserById(id);
    }

    @Override
    public int updateUserStatus(XcxUser user) {

        return xcxUserMapper.updateXcxUser(user);
    }
}
