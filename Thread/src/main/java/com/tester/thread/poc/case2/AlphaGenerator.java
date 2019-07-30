package com.tester.thread.poc.case2;

import com.tester.thread.utils.ThreadUtils;

import java.util.Observable;
import java.util.Observer;

public class AlphaGenerator implements Runnable, Observer {

    private MyConfig myConfig;

    public AlphaGenerator(MyConfig myConfig) {
        this.myConfig = myConfig;
    }

    @Override
    public void run() {

        String alphaGenerator= myConfig.getAlphabateRange();

        String [] range= alphaGenerator.split("-");

        for (int startRange = (int)range[0].charAt(0); startRange < (int)range[1].charAt(0) ;startRange ++)
        {
            String charName =String.valueOf((char)startRange);
            System.out.println(String.format("Printing: %s by %s useing config id is %d.", charName, Thread.currentThread().getName() , myConfig.hashCode()));
            ThreadUtils.ONE_SECOND.sleep();
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        myConfig = (MyConfig) arg;
    }
}
