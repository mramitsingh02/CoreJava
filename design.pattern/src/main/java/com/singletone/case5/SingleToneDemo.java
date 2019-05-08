package com.singletone.case5;

import java.util.concurrent.TimeUnit;

public class SingleToneDemo {
    public static void main(String[] args) {
        new Thread(new MySingleToneRunnable()).start();
        new Thread(new MySingleToneRunnable()).start();
        new Thread(new MySingleToneRunnable()).start();


    }

    private static class MySingleToneRunnable implements  Runnable {


        @Override
        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(200l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SingleTone singleTone = SingleTone.getInstance();
            System.out.println(singleTone.hashCode());
        }
    }
}
