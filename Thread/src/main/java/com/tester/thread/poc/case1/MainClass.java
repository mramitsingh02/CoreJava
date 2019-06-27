package com.tester.thread.poc.case1;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        MyConfig myConfig = new MyConfig("a-z", "1-20");
        System.out.println("Config Id is created with " + myConfig.hashCode());
        AlphaGenerator alp = new AlphaGenerator(myConfig);

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.scheduleAtFixedRate(alp, 0, 20, TimeUnit.SECONDS);
        //Thread t1 = new Thread(alp);
//        Thread t2 = new Thread(new NumberGenerator(myConfig));
        //    t1.start();
        //      t2.start();
        ThreadUtils.TWO_SECOND.sleep();
        myConfig = new MyConfig("a-p", "1-100");
        alp.setMyConfig(myConfig);
        System.out.println("Config Id is updated with " + myConfig.hashCode());
    }
}
