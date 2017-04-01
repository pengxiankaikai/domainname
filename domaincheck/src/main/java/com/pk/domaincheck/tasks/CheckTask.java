package com.pk.domaincheck.tasks;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.pk.domaincheck.common.HttpConnectionUtil;
import com.pk.domaincheck.domain.Result;
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
    public void checd(){
        String url = "https://checkapi.aliyun.com/check/checkdomain?callback=jQuery1111041458398579953926_1491025570650&domain=iviv.shop&token=check-web-hichina-com%3Afuaadqpzf7jda836gzzu1xma6a03onxo&_=1491025571165";
        String s = null;
        try {
            s =  HttpConnectionUtil.sendGet(url, null);
        } catch (Exception e) {
            log.error("connect fail, info: {}", e);
        }
        int i = s.indexOf("{");
        int j = s.indexOf("})");
        s = s.substring(i, j + 1);
        System.out.println("s = " + s);
        Result result = gson.fromJson(s, Result.class);
        if (result.getModule().get(0).getAvail().compareTo(0) == 0){
            log.info("");//成功消息
        }
        System.out.println("o = " + result.toString());
    }
}
