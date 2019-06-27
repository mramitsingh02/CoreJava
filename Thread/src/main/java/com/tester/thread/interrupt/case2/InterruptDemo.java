package com.tester.thread.interrupt.case2;

import java.math.BigInteger;

public class InterruptDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new LongComputationTask(new BigInteger("20"), new BigInteger("2")));
        thread.start();
        Thread.sleep(10000);
        thread.interrupt();
        System.out.println(Thread.currentThread().getName() +" thread is shutdown.");
    }

}
