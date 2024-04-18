package com.tester.thread.lock;

import com.tester.thread.utils.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class LockCase2 {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ExecutorService service = Executors.newFixedThreadPool(10);
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::add));
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::remove));
        Pools.off(service);
        System.out.println("Final Total : " + inventory.getItems());

    }

    public static class Inventory {
        final AtomicInteger al;

        public Inventory() {
            al = new AtomicInteger(0);
        }

        public void add() {
            al.incrementAndGet();
        }

        public void remove() {
            al.decrementAndGet();
        }

        public int getItems() {
            return al.get();
        }
    }
}
