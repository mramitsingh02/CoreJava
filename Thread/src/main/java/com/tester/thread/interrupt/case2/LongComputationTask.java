package com.tester.thread.interrupt.case2;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class LongComputationTask implements Runnable {
    private final AtomicBoolean flag;

    public LongComputationTask(AtomicBoolean flag) {

        this.flag = flag;
    }

    @Override
    public void run() {
     //   System.out.println(base + "^" + power + " = " + pow(base, power));
        while (!Thread.currentThread().isInterrupted() && !flag.get() ) {

            if(flag.get()){
                System.out.println("Call interrupt");
                Thread.currentThread().interrupt();
            }

            try {
                System.out.println(Thread.currentThread().getName() +  " sleeping for 5 min");
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
