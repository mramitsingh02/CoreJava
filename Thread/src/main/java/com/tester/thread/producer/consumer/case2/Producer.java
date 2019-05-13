package com.tester.thread.producer.consumer.case2;


import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> listOfItems;
    private final AtomicInteger itemNumber = new AtomicInteger(1);

    public Producer(BlockingQueue<Integer> listOfItems) {
        this.listOfItems = listOfItems;
    }

    @Override
    public void run() {

        while (true)
            if (listOfItems.size() == 10) {
                System.out.println("Queue is full, please wait to get items");
            } else {
                Integer itemNumberI = itemNumber.getAndIncrement();
                listOfItems.offer(itemNumberI);
                System.out.println("Producer : " + itemNumberI);
                ThreadUtils.ONE_SECOND.sleep();
            }


    }
}
