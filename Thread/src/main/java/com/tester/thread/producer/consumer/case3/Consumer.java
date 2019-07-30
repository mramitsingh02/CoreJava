package com.tester.thread.producer.consumer.case3;

import com.tester.thread.utils.ThreadUtils;

import java.util.List;

public class Consumer implements Runnable {
    private final List<Integer> listOfItems;
    private final String lockObject;

    public Consumer(List<Integer> listOfItems, String lockObject) {
        this.listOfItems = listOfItems;
        this.lockObject = lockObject;
    }

    @Override
    public void run() {
        synchronized (lockObject) {
            while (true) {
                if (listOfItems.size() == 0) {
                    try {
                        lockObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    Integer itemId = listOfItems.remove(0);
                    System.out.println("Consume : <==(" + itemId + ").");
                    ThreadUtils.ONE_SECOND.sleep();
                    lockObject.notifyAll();
                }
            }
        }

    }
}
