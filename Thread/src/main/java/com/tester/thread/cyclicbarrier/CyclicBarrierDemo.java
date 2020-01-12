package com.tester.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        new Thread(new MyRunnable(cyclicBarrier)).start();

        TimeUnit.SECONDS.sleep(1l);
        System.out.println("Waiting for other 1");
        new Thread(new MyRunnable(cyclicBarrier)).start();
        new Thread(new MyRunnable(cyclicBarrier)).start();
        TimeUnit.SECONDS.sleep(1l);
        System.out.println("Waiting for other 2");

        new Thread(new MyRunnable(cyclicBarrier)).start();
        TimeUnit.SECONDS.sleep(1l);
        System.out.println("Waiting for othere 3");
        System.out.println("Main Done");


    }
}
