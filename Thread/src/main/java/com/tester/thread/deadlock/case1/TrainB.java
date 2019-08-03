package com.tester.thread.deadlock.case1;

import com.tester.thread.utils.ThreadUtils;

public class TrainB implements Runnable {
        private final Track trackA;
        private final Track trackB;

        public TrainB(Track trackA, Track trackB) {
            this.trackA = trackA;
            this.trackB = trackB;
        }

        public void cross() {
            synchronized (trackA) {
                synchronized (trackB) {
                    System.out.println("Passing Train B");
                    ThreadUtils.ONE_SECOND.sleep();
                }
            }
        }

        @Override
        public void run() {
            while (true) {
                cross();
            }
        }
    }