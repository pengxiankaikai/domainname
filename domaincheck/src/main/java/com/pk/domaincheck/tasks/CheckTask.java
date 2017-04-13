package com.pk.domaincheck.tasks;

import com.google.gson.Gson;
import com.pk.domaincheck.common.HttpConnectionUtil;
import com.pk.domaincheck.domain.Result;
import com.pk.domaincheck.domain.domain.Domainproduct;
import com.pk.domaincheck.domain.service.DomainproductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
@Component
public class CheckTask {

    private static final Logger log = LoggerFactory.getLogger(CheckTask.class);

    Gson gson = new Gson();

    @Resource
    private DomainproductService domainproductService;


    @Scheduled(cron = "0/20 * * * * *")
    public void checkdomain(){
        String url = "http://www.yumingco.com/api";
        Domainproduct domainproduct = domainproductService.selectLastOne();
        String param = "domain=_&suffix=com";
        param = param.replace("_", domainproduct.getVal());
        String s = null;
        try {
            s =  HttpConnectionUtil.sendGet(url, param);
        } catch (Exception e) {
            log.error("connect fail, info: {}", e);
        }
        s = s.replaceAll("/n", "");
        Result result = gson.fromJson(s, Result.class);
        if (result.getStatus() && result.getAvailable()){
            log.info("this val = " + domainproduct.getVal() + " ---- can register");
        }else {
            log.warn("this val = " + domainproduct.getVal() + " ---- NO NO NO");
        }
    }
}
