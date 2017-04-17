package com.pk.domaincheck.domain.service;

import com.pk.domaincheck.base.service.BaseService;
import com.pk.domaincheck.domain.domain.Domainproduct;

/**
 * Created by pengkai
 * @date 2017-04-11.
 */
public interface DomainproductService extends BaseService<Domainproduct>{

    /**
     * 查找最后一个没有使用过的记录
     * @return
     */
    Domainproduct selectLastOne();

    /**
     * 根据id更新数据已使用
     * @param id id
     * @return
     */
    int updateUseBy(Boolean isavailable, Integer id);
}
