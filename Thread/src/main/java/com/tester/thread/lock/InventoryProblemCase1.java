package com.tester.thread.lock;

import com.tester.thread.utils.Pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class InventoryProblemCase1 {
    private static Lock semaphore = new ReentrantLock();

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        ExecutorService service = Pools.of(10);
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::add));
        IntStream.range(1, 101).forEach(i -> service.submit(inventory::remove));
        Pools.off(service);
        //ThreadUtils.TWO_SECOND.sleep();
        System.out.println("Final Total : "+ inventory.getItems());

    }

    public static class Inventory {
        private int items;

        public void add() {
            items++;
        }

        public void remove() {
            items--;
        }

        public int getItems() {
            return items;
        }
    }
}
