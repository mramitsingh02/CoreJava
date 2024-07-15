package com.java8.stream;

public class TestAcumlator {

    public static void main(String[] args) {
        Accumulator accumulator = new Accumulator((x) -> x <= 12);
        accumulator.add(new Pair(0, 11));
        accumulator.add(new Pair(1, 2));
        accumulator.add(new Pair(2, 1));
        System.out.println(accumulator.accumulate());
        System.out.println(accumulator.isPossible());
    }
}
