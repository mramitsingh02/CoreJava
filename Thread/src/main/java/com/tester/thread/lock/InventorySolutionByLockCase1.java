package com.tester.thread.lock;

import com.tester.thread.utils.Locks;
import com.tester.thread.utils.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.stream.IntStream;

public class InventorySolutionByLockCase1 {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ExecutorService service = Pools.of(10);
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::add));
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::remove));
        Pools.off(service);
        System.out.println("Final Total : " + inventory.getItems());

    }

    public static class Inventory {
        final Lock lock;
        private volatile int items;

        public Inventory() {
            lock = Locks.of();
        }

        public void add() {
            try {
                lock.lock();
                items++;
            } finally {
                lock.unlock();
            }
        }

        public void remove() {
            try {
                lock.lock();
                items--;
            } finally {
                lock.unlock();
            }
        }

        public int getItems() {
            return items;
        }
    }
}
