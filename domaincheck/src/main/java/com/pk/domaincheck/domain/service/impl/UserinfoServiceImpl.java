package com.pk.domaincheck.domain.service.impl;

import com.pk.domaincheck.domain.domain.Userinfo;
import com.pk.domaincheck.domain.mapper.UserinfoMapper;
import com.pk.domaincheck.domain.service.UserinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by pengkai
 * @date 2017-04-11.
 */
@Service
public class UserinfoServiceImpl implements UserinfoService{

    @Resource
    private UserinfoMapper userinfoMapper;

    @Override
    public int insert(Userinfo record) {
        return userinfoMapper.insert(record);
    }
}
