package com.tester.thread.atomic;

import com.tester.thread.utils.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicCase1 {
    private static final int NUMBER_OF_ITERATION = 3;
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
        testIncrementAndGet();
        testAccumulateAndGet();
        testUpdateAndGet();
    }

    private static void testUpdateAndGet() {
        atomicInteger.set(0);
        ExecutorService executorService = Pools.of();
        IntStream.range(0, NUMBER_OF_ITERATION).forEach(i ->  {
            Runnable task = () -> atomicInteger.updateAndGet(n  -> {
                //System.out.println("N = "+ n);
                //System.out.println("NU = " + (n + 2));
                return n + 2;
            } );
            executorService.submit(task);
        });
        Pools.off(executorService);
        System.out.format("Update: Expected=%d; Is=%d\n", NUMBER_OF_ITERATION, atomicInteger.get());
    }

    private static void testAccumulateAndGet() {
        atomicInteger.set(0);
        ExecutorService executorService = Pools.of();
        IntStream.range(0, NUMBER_OF_ITERATION).forEach(i ->  {
            Runnable task = () -> atomicInteger.accumulateAndGet(i, (m, n) -> m + n);
            executorService.submit(task);
        });
            Pools.off(executorService);
            System.out.format("Accumulate: Expected=%d; Is=%d\n", NUMBER_OF_ITERATION, atomicInteger.get());
        }

        private static void testIncrementAndGet() {
        atomicInteger.set(0);
            ExecutorService executorService = Pools.of();
            IntStream.range(0, NUMBER_OF_ITERATION).forEach(i -> executorService.submit(atomicInteger::incrementAndGet));
            Pools.off(executorService);
            System.out.format("Increment: Expected=%d; Is=%d\n", NUMBER_OF_ITERATION, atomicInteger.get());
        }

    }
