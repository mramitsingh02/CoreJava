package com.tester.thread.semaphore;

import com.tester.thread.utils.Pools;
import com.tester.thread.utils.ThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SemaphoreCase1 {
    private static Semaphore semaphore = new Semaphore(5);

    public static void main(String[] args) {

        ExecutorService service = Pools.of(10);
        IntStream.range(1, 11).forEach(i -> service.submit(SemaphoreCase1::doWork));
        Pools.off(service);

    }

    private static void doWork() {
        boolean permits = false;
        try {
            permits = semaphore.tryAcquire(1, TimeUnit.SECONDS);
            if (permits) {
                System.out.println("Semaphore Acquire....");
                ThreadUtils.FIVE_SECOND.sleep();
            } else {
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
