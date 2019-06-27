package com.tester.thread.interrupt.case1;

public class InterruptRunner implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread Start to work.");
            Thread.sleep(100000);
            System.out.println("Thread Stoped.");
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted by external world.");
        }
    }
}
