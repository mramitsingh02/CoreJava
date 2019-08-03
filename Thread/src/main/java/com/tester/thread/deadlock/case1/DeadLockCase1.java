package com.tester.thread.deadlock.case1;

public class DeadLockCase1 {

    public static void main(String[] args) {
        Track trackA = new Track();
        Track trackB = new Track();
        TrainA trainA = new TrainA(trackA, trackB);
        TrainB trainB = new TrainB(trackA, trackB);

        new Thread(trainA).start();
        new Thread(trainB).start();



    }


}
