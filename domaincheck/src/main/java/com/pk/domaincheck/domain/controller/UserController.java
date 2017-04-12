package com.pk.domaincheck.domain.controller;

import com.pk.domaincheck.base.biz.RetBiz;
import com.pk.domaincheck.base.biz.RetResult;
import com.pk.domaincheck.domain.domain.Userinfo;
import com.pk.domaincheck.domain.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by pengkai
 * @date 2017-04-11.
 * @mail pengxiankaikai@163.com
 */
@Controller
public class UserController {

    @Resource
    private UserinfoService userinfoService;

    @RequestMapping("/index")
    @ResponseBody
    public RetBiz index(String code){
        Userinfo userinfo = new Userinfo();
        userinfo.setCreatetime(new Timestamp(new Date().getTime()));
        userinfo.setLastlogintime(new Timestamp(new Date().getTime()));
        userinfoService.insert(userinfo);
        return new RetBiz(RetResult.FAIL);
    }
}
