package com.pk.domaincheck.domain.controller;

import com.pk.domaincheck.domain.domain.Userinfo;
import com.pk.domaincheck.domain.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by pengkai
 * @date 2017-04-11.
 */
@Controller
public class IndexController {

    @Resource
    private UserinfoService userinfoService;

    @RequestMapping("/index")
    public String index(String code){
        Userinfo userinfo = new Userinfo();
        userinfo.setCreatetime(new Timestamp(new Date().getTime()));
        userinfo.setLastlogintime(new Timestamp(new Date().getTime()));
        userinfoService.insert(userinfo);
        return "index";
    }
}
