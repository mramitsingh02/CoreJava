package com.tester.thread.producer.consumer.case2;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.concurrent.BlockingQueue;


public class Consumer implements Runnable {
    private final BlockingQueue<Integer> listOfItems;

    public Consumer(BlockingQueue<Integer> listOfItems) {
        this.listOfItems = listOfItems;
    }

    @Override
    public void run() {
        while (true){
            if(listOfItems.size() == 0){
                System.out.println("Queue is empty.");
            }
            else
            {
                try {
                    Integer i = listOfItems.take();
                    System.out.println("Consumer : " + i);
                    ThreadUtils.ONE_SECOND.sleep();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
