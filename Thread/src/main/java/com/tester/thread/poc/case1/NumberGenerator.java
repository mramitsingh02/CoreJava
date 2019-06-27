package com.tester.thread.poc.case1;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

public class NumberGenerator implements Runnable{

    private final MyConfig myConfig;

    public NumberGenerator(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    @Override
    public void run() {

        String numberGenerator= myConfig.getNumberRange();

        String [] range= numberGenerator.split("-");

        for (int startRange = Integer.valueOf(range[0]); startRange <= Integer.valueOf(range[1]) ;startRange ++)
        {
            System.out.println(String.format("Printing: %d by %s useing config id is %d.", startRange, Thread.currentThread().getName() , myConfig.hashCode()));
            ThreadUtils.ONE_SECOND.sleep();
        }
    }
}
