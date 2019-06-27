package com.tester.thread.poc.case3;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.Timer;

public class MainClass {

    public static void main(String[] args) {
        MyConfig myConfig = new MyConfig("a-i", "1-20", 15000);
        System.out.println("Config Id is created with " + myConfig.hashCode());

        LeaderThread leaderThread = new LeaderThread();
        leaderThread.setMyConfig(myConfig);
        leaderThread.start();

        ThreadUtils.TWO_SECOND.sleep();

        myConfig = new MyConfig("a-c", "1-10", 20);
        leaderThread.setMyConfig(myConfig);
        leaderThread.reset();

        ThreadUtils.TWO_MINUTE.sleep();

        System.out.println("Main thread Kill");

    }


}
