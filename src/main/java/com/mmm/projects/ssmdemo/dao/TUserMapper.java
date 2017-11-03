package com.mmm.projects.ssmdemo.dao;

import com.mmm.projects.ssmdemo.entity.TUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TUserMapper extends BaseMapper<TUser>{

    List<TUser> findAll();
}