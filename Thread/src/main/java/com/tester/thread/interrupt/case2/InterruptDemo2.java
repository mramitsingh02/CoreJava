package com.tester.thread.interrupt.case2;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterruptDemo2 {
    public static void main(String[] args) throws InterruptedException {

        AtomicBoolean flag = new AtomicBoolean(false);

        LongComputationTask longComputationTask = new LongComputationTask(flag);
        LongComputationTask longComputationTask1 = new LongComputationTask(flag);
        LongComputationTask longComputationTask2 = new LongComputationTask(flag);

        ExecutorService executorService = Executors.newFixedThreadPool(10 );

        executorService.execute(longComputationTask);
        executorService.execute(longComputationTask1);
        executorService.execute(longComputationTask2);

        TimeUnit.SECONDS.sleep(10);

        flag.getAndSet(true);
        System.out.println(Thread.currentThread().getName() + " thread is shutdown.");
    }

}
