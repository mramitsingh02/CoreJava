package com.tester.thread.producer.consumer.case4;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
    private final MyCustomeQueue<Integer> listOfItems;

    private AtomicInteger orderId= new AtomicInteger(0);

    public Producer(MyCustomeQueue<Integer> listOfItems) {
        this.listOfItems = listOfItems;
    }

    @Override
    public void run() {
        while (true) {
            Integer orderNumber = orderId.incrementAndGet();
            System.out.println("Producer To Queue: " + orderNumber);
            listOfItems.add(orderNumber);
            ThreadUtils.ONE_SECOND.sleep();
        }
    }
}
