package com.tester.thread.utils;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class Pools {

    public static ExecutorService of() {
        return newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    public static ExecutorService of(int noOfPoolSize) {
        return newFixedThreadPool(noOfPoolSize);
    }

    public static void off(ExecutorService executorService) {
        if (Objects.nonNull(executorService)) {
            if (!executorService.isTerminated()) {
                try {
                    executorService.shutdown();
                    executorService.awaitTermination(1, TimeUnit.MINUTES);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    executorService.shutdownNow();
                }
            }
        }
    }


}
