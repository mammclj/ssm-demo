package com.mmm.projects.ssmdemo.service;

import com.mmm.projects.ssmdemo.entity.TUser;

import java.util.List;

public interface TUserService {
    List<TUser> findItemByPage(int currentPage, int pageSize);
}
