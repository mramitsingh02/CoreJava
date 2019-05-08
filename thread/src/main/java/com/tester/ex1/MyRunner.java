package com.tester.ex1;

import java.util.concurrent.TimeUnit;

public class MyRunner implements Runnable {
    private final Displya d;
    private final String name;


    public MyRunner(Displya d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(100l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            d.display(name + " : " + i);
        }
    }
}
