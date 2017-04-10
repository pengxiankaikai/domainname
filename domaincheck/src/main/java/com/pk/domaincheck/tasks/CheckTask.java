package com.pk.domaincheck.tasks;

import com.google.gson.Gson;
import com.pk.domaincheck.common.HttpConnectionUtil;
import com.pk.domaincheck.domain.Result;
import com.pk.domaincheck.domain.WanWangResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
@Component
public class CheckTask {

    private static final Logger log = LoggerFactory.getLogger(CheckTask.class);

    Gson gson = new Gson();

    @Scheduled(cron = "0/10 * * * * *")
    public void checkdomain(){
        String url = "http://www.yumingco.com/api";
        String param = "domain=irose&suffix=com";
        String s = null;
        try {
            s =  HttpConnectionUtil.sendGet(url, param);
        } catch (Exception e) {
            log.error("connect fail, info: {}", e);
        }
        s = s.replaceAll("/n", "");
        Result result = gson.fromJson(s, Result.class);
        if (result.getStatus() && result.getAvailable()){
            System.out.println("该域名可用");
        }else {
            System.out.println("该域名已被注册");
        }
    }
}
