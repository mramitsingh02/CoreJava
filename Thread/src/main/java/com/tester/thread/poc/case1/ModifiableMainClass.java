package com.tester.thread.poc.case1;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

public class ModifiableMainClass {
    public static void main(String[] args) {
        MyModifiableConfig myConfig = new MyModifiableConfig("a-z", "1-20");
        System.out.println("Config Id is created with " + myConfig.hashCode());

        Thread t1 = new Thread(new AlphaGenerator(myConfig));
        Thread t2 = new Thread(new NumberGenerator(myConfig));
        t1.start();
        t2.start();
        ThreadUtils.ONE_SECOND.sleep();
        MyModifiableConfig  myModifiableConfig = new MyModifiableConfig("a-p", "1-100");

        myConfig.update(myModifiableConfig);

        System.out.println("Config Id is updated with " + myConfig.hashCode());
    }
}
