package com.tester.thread.interrupt.case2;

import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new LongComputationTask(new AtomicBoolean(false)));
        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
        System.out.println(Thread.currentThread().getName() +" thread is shutdown.");
    }

}
