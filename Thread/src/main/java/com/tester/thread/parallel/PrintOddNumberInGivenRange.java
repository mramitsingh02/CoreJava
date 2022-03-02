package com.tester.thread.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.IntStream;

public class PrintOddNumberInGivenRange {
    public static void main(String[] args) {
        PrintOddNumberInGivenRange thisInstance = new PrintOddNumberInGivenRange();
        thisInstance.algo1(5, 51);
        thisInstance.algo2(5, 51);
        thisInstance.algo3(5, 51);
    }

    public void algo1(int start, int end) {
        List<Integer> collectAllOddNumber = IntStream.range(start, end).limit(end).filter(x -> x % 2 != 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(collectAllOddNumber);
    }

    public void algo2(int start, int end) {
        List<Integer> collectAllOddNumber = IntStream.iterate(start, x -> true, x -> x + 1).limit(end).filter(x -> x % 2 != 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(collectAllOddNumber);
    }

    public void algo3(int start, int end) {
        List<Integer> collectAllOddNumber = IntStream.rangeClosed(start, end).filter(x -> x % 2 != 0).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(collectAllOddNumber);
    }


}
