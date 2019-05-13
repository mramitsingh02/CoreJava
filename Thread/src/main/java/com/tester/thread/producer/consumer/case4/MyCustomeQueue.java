package com.tester.thread.producer.consumer.case4;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCustomeQueue<T> {
    private final Queue<T> myQueue;
    private final int intialCapicity;
    private Lock internalLock = new ReentrantLock(true);
    private Condition isFull = internalLock.newCondition();
    private Condition isEmpty = internalLock.newCondition();

    public MyCustomeQueue() {
        this(16);
    }

    public MyCustomeQueue(int initialCapicity) {
        this.intialCapicity = initialCapicity;
        this.myQueue = new ArrayBlockingQueue<T>(initialCapicity);
    }

    public void add(T args) {
        internalLock.lock();
        if (myQueue.size() == intialCapicity) {
            try {
                System.out.println("Full");
                isFull.await();
                System.out.println("Full...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        myQueue.add(args);
        isEmpty.signalAll();
        internalLock.unlock();
    }

    public T remove() {
        internalLock.lock();
        if (myQueue.size() == 0) {
            try {
                System.out.println("Empty");
                isEmpty.await();
                System.out.println("Empty...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        T t = myQueue.remove();
        isFull.signalAll();
        internalLock.unlock();

        return t;

    }


}
