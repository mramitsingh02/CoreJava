package com.tester.thread.poc.case3;

import java.util.Timer;

public class LeaderThread {
    private MyTimerTask alp;
    private MyConfig myConfig;
    private Timer timer;

    public void start() {
        createThread(this.myConfig);
        createTimer();
        timer.scheduleAtFixedRate(alp, 0, myConfig.getDelayTimeInMinute());
    }

    public void reset() {
        cancleThread();
        createTimer();
        createThread(this.myConfig);
        timer.scheduleAtFixedRate(alp, 0, myConfig.getDelayTimeInMinute());
    }


    private void cancleThread() {
        alp.cancel();
        timer.cancel();
        timer.purge();
        alp = null;
        timer = null;

    }

    public MyConfig getMyConfig() {
        return myConfig;
    }

    public void setMyConfig(MyConfig myConfig) {
        this.myConfig = myConfig;
        createThread(myConfig);
        alp.setMyConfig(this.myConfig);
        System.out.println("Config Updated.");
    }

    private void createThread(MyConfig myConfig) {
        if (alp == null) {
            alp = new MyTimerTask(myConfig);
        }

    }

    private void createTimer() {
        if (timer == null) {
            timer = new Timer(true);
        }

    }
}
