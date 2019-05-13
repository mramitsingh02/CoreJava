package com.tester.thread.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CountDownDemo {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(4);
        new Thread(new MyRunnable(countDownLatch)).start();
        new Thread(new MyRunnable(countDownLatch)).start();
        new Thread(new MyRunnable(countDownLatch)).start();
        new Thread(new MyRunnable(countDownLatch)).start();
        countDownLatch.await(10l, TimeUnit.SECONDS);

        System.out.println("Main-Done");

    }
}
