package com.tester.thread.countdown;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {
    private final CountDownLatch countDownLatch;

    public MyRunnable(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " (" + i + ")" + "[" + countDownLatch.getCount() + "]");
        }
        try {
            countDownLatch.countDown();
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
