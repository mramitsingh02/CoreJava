package com.tester.thread.poc.case2;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

public class MainClass {
    public static void main(String[] args) {
        MyConfig myConfig = new MyConfig("a-z", "1-20");
        System.out.println("Config Id is created with " + myConfig.hashCode());

        Thread t1 = new Thread(new AlphaGenerator(myConfig));
        Thread t2 = new Thread(new NumberGenerator(myConfig));
        t1.start();
        t2.start();
        ThreadUtils.ONE_SECOND.sleep();
        myConfig = new MyConfig("a-p", "1-100");
        System.out.println("Config Id is updated with " + myConfig.hashCode());
    }
}
