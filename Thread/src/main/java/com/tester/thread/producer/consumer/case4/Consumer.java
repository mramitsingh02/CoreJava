package com.tester.thread.producer.consumer.case4;

import com.tester.thread.producer.consumer.utils.ThreadUtils;

public class Consumer implements Runnable {
    private final MyCustomeQueue<Integer> listOfItems;

    public Consumer(MyCustomeQueue<Integer> listOfItems) {
        this.listOfItems = listOfItems;
    }

    @Override
    public void run() {

        while (true) {
            Integer orderNumber = listOfItems.remove();
            System.out.println("Consumer from Queue : " + orderNumber);
            ThreadUtils.FIVE_SECOND.sleep();
        }


    }
}
