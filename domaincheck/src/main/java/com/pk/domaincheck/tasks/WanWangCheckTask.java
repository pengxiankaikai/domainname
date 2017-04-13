package com.pk.domaincheck.tasks;

import com.google.gson.Gson;
import com.pk.domaincheck.common.HttpConnectionUtil;
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
public class WanWangCheckTask {

    private static final Logger log = LoggerFactory.getLogger(WanWangCheckTask.class);

    Gson gson = new Gson();

//    @Scheduled(cron = "* * * * * 0/10")
    public void checd(){
        String url = "https://checkapi.aliyun.com/check/checkdomain?callback=jQuery1111025134699921105064_1491474026536&domain=a.shop&token=check-web-hichina-com%3Ardbvjxg98j9axenzeqld2kb4vssbctnm&_=1491474026640";
//        String url = "http://panda.www.net.cn/cgi-bin/check.cgi"; //返回xml字符串 万网接口
        String param = "domain=irose&suffix=shop";
        String s = null;
        try {
            s =  HttpConnectionUtil.sendGet(url, param);
        } catch (Exception e) {
            log.error("connect fail, info: {}", e);
        }
        int i = s.indexOf("{");
        int j = s.indexOf("})");
        s = s.substring(i, j + 1);
        System.out.println("s = " + s);
        WanWangResult result = gson.fromJson(s, WanWangResult.class);
        if (null != result.getModule() && result.getModule().get(0).getAvail().compareTo(0) == 0){
            log.info("");//成功消息
        }else {
            log.info("query fail, fail season : " + result.getErrorMsg());
        }
    }
}
