package com.tester.thread.producer.consumer.case1;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

import java.util.List;

public class Consumer implements Runnable {
    private final List<String> stringList;

    public Consumer(List<String> listOfItems) {
        stringList = listOfItems;
    }


    @Override
    public void run() {

        while (true) {
            synchronized (stringList) {
                if (stringList.size() == 0) {
                    try {
                        System.out.println("Queue is empty, Let have some order.\nConsumer Thread Waiting");
                        stringList.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    String removeItems = stringList.remove(0);
                    System.out.println("Consumer : " + removeItems);
                    stringList.notify();
                    ThreadUtils.ONE_SECOND.sleep();
                }
            }
        }
    }
}

