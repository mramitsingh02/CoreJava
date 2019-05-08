package com.tester.thread.producer.consumer.case3;


import com.tester.thread.producer.consumer.utils.ThreadUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {
    private final List<Integer> listOfItems;
    private final int maxSize;
    private final String lockObject;
    private AtomicInteger itemGenereation = new AtomicInteger(1);

    public Producer(List<Integer> listOfItems, String lockObject, int maxSize) {
        this.listOfItems = listOfItems;
        this.lockObject = lockObject;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {

        synchronized (lockObject) {
            while (true) {
                if(listOfItems.size() == maxSize){
                    try {
                        lockObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer itemId = itemGenereation.getAndIncrement();
                System.out.println("Produce : ==>(" + itemId + ").");
                listOfItems.add(itemId);
                lockObject.notifyAll();
                ThreadUtils.ONE_SECOND.sleep();

            }
        }


    }
}
