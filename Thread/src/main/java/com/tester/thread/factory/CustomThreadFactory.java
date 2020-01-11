package com.tester.thread.factory;

import com.tester.thread.utils.Pools;
import com.tester.thread.utils.ThreadUtils;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class CustomThreadFactory {
    private static Semaphore semaphore = new Semaphore(5);

    public static void main(String[] args) {

        //ExecutorService service = Pools.of(10);

        ThreadFactory threadFactory = new ThreadFactory(){

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, "Custom Thread Name : ");
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(10, threadFactory);
        IntStream.range(1, 11).parallel().forEach(i -> service.submit(CustomThreadFactory::doWork));
        Pools.off(service);

    }

    private static void doWork() {
        boolean permits = false;
        try {
            permits = semaphore.tryAcquire(1, TimeUnit.SECONDS);
            if (permits) {
                System.out.print(Thread.currentThread().getName() + " = ");
                System.out.println("Semaphore Acquire....");
                ThreadUtils.FIVE_SECOND.sleep();
            } else {
                System.out.print(Thread.currentThread().getName() + " = ");
                System.out.println("Semaphore Could not acquire Lock!!!!!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (permits) {
                semaphore.release();
            }
        }
    }
}
