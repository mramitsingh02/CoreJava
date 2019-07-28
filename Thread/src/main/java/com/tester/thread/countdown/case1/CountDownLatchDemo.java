package com.tester.thread.countdown.case1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        List<Integer> listOfInput= Arrays.asList(1, 12, 23,22, 222);

        listOfInput.stream().map(x -> new MyFactorialThread(x, countDownLatch)).collect(Collectors.toList());


    }

}
