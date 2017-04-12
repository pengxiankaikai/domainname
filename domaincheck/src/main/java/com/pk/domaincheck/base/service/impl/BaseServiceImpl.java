package com.pk.domaincheck.base.service.impl;

import com.pk.domaincheck.base.mapper.BaseMapper;
import com.pk.domaincheck.base.service.BaseService;

/**
 * Created by pengkai
 * @date 2017-04-11.
 * @mail pengxiankaikai@163.com
 */
public abstract class BaseServiceImpl<T> implements BaseService<T>{

    public abstract BaseMapper getMapper();

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T t) {
        return getMapper().insert(t);
    }

    @Override
    public T selectByPrimaryKey(Integer id) {
        return (T) getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return getMapper().updateByPrimaryKey(t);
    }
}
