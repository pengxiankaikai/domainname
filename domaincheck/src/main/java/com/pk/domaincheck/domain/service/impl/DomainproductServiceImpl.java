package com.pk.domaincheck.domain.service.impl;

import com.pk.domaincheck.base.mapper.BaseMapper;
import com.pk.domaincheck.base.service.impl.BaseServiceImpl;
import com.pk.domaincheck.domain.domain.Domainproduct;
import com.pk.domaincheck.domain.mapper.DomainproductMapper;
import com.pk.domaincheck.domain.service.DomainproductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by pengkai
 * @date 2017-04-11.
 */
@Service
@Transactional
public class DomainproductServiceImpl extends BaseServiceImpl<Domainproduct> implements DomainproductService{

    @Resource
    private DomainproductMapper domainproductMapper;

    @Override
    public BaseMapper getMapper() {
        return domainproductMapper;
    }

    @Override
    public Domainproduct selectLastOne() {
        return domainproductMapper.selectLastOne();
    }
}
