package com.mmm.projects.ssmdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.mmm.projects.ssmdemo.dao.TUserMapper;
import com.mmm.projects.ssmdemo.entity.TUser;
import com.mmm.projects.ssmdemo.model.PageBean;
import com.mmm.projects.ssmdemo.service.TUserService;

import java.util.List;

/**
 * @Author 马孟孟【mamengmeng@msymobile.com】
 * @Date 2017/11/3 18:04
 */
public class TUserServiceImpl implements TUserService {
    private TUserMapper tUserMapper;
    @Override
    public List<TUser> findItemByPage(int currentPage, int pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<TUser> allUsers = this.tUserMapper.findAll();
        //int countNums = this.tUserMapper.countItems();
        //PageBean<TUser> pageData = new PageBean<>(currentPage,pageSize,)
        return null;
    }
}
