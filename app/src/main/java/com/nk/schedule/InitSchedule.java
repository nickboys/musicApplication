package com.nk.schedule;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by 87825 on 2018/3/10.
 */
@Component
public class InitSchedule {
    private Logger logger = Logger.getLogger(this.getClass());
    @Scheduled(cron = "0/5 * * * * ? ")
    public void init(){
       logger.info("init shchdule on time");
    }
}
