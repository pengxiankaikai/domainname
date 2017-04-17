package com.pk.domaincheck.tasks;

import com.pk.domaincheck.domain.domain.Domainproduct;
import com.pk.domaincheck.domain.service.DomainproductService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Random;

/**
 * Created by pengkai
 * @date 2017-04-01.
 */
@Component
public class DomainProductTask {

    @Resource
    private DomainproductService domainproductService;

    @Scheduled(cron = "0/19 * * * * *")
    public void product(){
        Random random = new Random();
        boolean flag = false;
        String name = "";
        for (int i = 0; i < 3; i++) {
            int result = 97 + random.nextInt(25);
            name += (char)result;
            if (i == 2){
                flag = true;
            }
        }
        if (flag){
            Domainproduct domainproduct = new Domainproduct(name);
            domainproductService.insert(domainproduct);
       }
    }
}
