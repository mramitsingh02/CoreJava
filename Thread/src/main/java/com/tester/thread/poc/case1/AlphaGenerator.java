package com.tester.thread.poc.case1;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

public class AlphaGenerator implements Runnable{

    public MyConfig getMyConfig() {
        return myConfig;
    }

    public void setMyConfig(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    private  MyConfig myConfig;

    public AlphaGenerator(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    @Override
    public void run() {
        String alphaGenerator= myConfig.getAlphabateRange();
        String [] range= alphaGenerator.split("-");
        for (int startRange = (int)range[0].charAt(0); startRange <= (int)range[1].charAt(0) ;startRange ++)
        {
            String charName =String.valueOf((char)startRange);
            System.out.println(String.format("Printing: %s by %s useing config id is %d.", charName, Thread.currentThread().getName() , myConfig.hashCode()));
            ThreadUtils.ONE_SECOND.sleep();
        }
    }
}
