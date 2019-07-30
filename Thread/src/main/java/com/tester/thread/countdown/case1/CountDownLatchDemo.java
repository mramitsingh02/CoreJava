package com.tester.thread.countdown.case1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        List<Integer> listOfInput= Arrays.asList(1, 12, 23,22, 222);
        CountDownLatch countDownLatch = new CountDownLatch(4);
        //listOfInput.stream().map(x -> new MyFactorialThread(x, countDownLatch)).collect(Collectors.toList());


    }

}
