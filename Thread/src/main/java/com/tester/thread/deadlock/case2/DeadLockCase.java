package com.tester.thread.deadlock.case2;

import com.tester.thread.deadlock.case1.Track;
import com.tester.thread.deadlock.case1.TrainA;
import com.tester.thread.deadlock.case1.TrainB;

public class DeadLockCase {

    public static void main(String[] args) {
        Track trackA=new Track();
        Track trackB=new Track();
        TrainA trainA = new TrainA(trackA, trackB);
        TrainB trainB = new TrainB(trackA, trackB);

        new Thread(trainA).start();
        new Thread(trainB).start();



    }


}
