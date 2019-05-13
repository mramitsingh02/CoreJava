package com.tester.thread.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyRunnable implements Runnable {
    private final CyclicBarrier cyclicBarrier;

    public MyRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }


    @Override
    public void run() {
        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " (" + i + ")");
        }
    }
}
