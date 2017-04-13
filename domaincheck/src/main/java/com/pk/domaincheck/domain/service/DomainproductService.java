package com.pk.domaincheck.domain.service;

import com.pk.domaincheck.base.service.BaseService;
import com.pk.domaincheck.domain.domain.Domainproduct;

/**
 * Created by pengkai
 * @date 2017-04-11.
 */
public interface DomainproductService extends BaseService<Domainproduct>{

    Domainproduct selectLastOne();
}
