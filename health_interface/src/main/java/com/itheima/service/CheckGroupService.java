package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckGroup;

import java.util.List;

public interface CheckGroupService {
    public void add(CheckGroup checkGroup, Integer[] checkitemIds);
    public PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);
    public CheckGroup findById(Integer id);
    public void edit(CheckGroup checkGroup, Integer[] checkitemIds);
    public List<CheckGroup> findAll();
}
