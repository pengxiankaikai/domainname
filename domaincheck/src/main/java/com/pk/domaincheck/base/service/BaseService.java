package com.pk.domaincheck.base.service;

/**
 * Created by pengkai
 * @date 2017-04-11.
 * @mail pengxiankaikai@163.com
 */
public interface BaseService<T> {

    /**
     * del
     * @param id id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     * @param t Object
     * @return
     */
    int insert(T t);

    /**
     * select
     * @param id id
     * @return
     */
    T selectByPrimaryKey(Integer id);

    /**
     * update
     * @param t Object
     * @return
     */
    int updateByPrimaryKey(T t);
}
