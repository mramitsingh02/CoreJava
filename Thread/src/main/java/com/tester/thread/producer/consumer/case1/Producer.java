package com.tester.thread.producer.consumer.case1;

import com.tester.thread.utils.ThreadUtils;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private final List<String> stringList;
    private final int MAX_SIZE;
    private AtomicInteger itemNumber = new AtomicInteger(1);

    public Producer(List<String> listOfItems, int maxSize) {
        stringList = listOfItems;
        MAX_SIZE = maxSize;
    }


    @Override
    public void run() {
        synchronized (stringList) {
            while (true) {
                if (stringList.size() == MAX_SIZE) {
                    try {
                        System.out.println("Queue is Full, waiting for empty");
                        stringList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    String addItems = String.valueOf(itemNumber.getAndIncrement());
                    System.out.println("Produce : " + addItems);
                    stringList.add(addItems);
                    stringList.notify();
                    ThreadUtils.ONE_SECOND.sleep();
                }
            }
        }
    }
}

