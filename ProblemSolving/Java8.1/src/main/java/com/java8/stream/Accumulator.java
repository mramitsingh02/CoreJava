package com.java8.stream;

import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class Accumulator {
    private final Queue<Pair> list;
    private final Predicate<Integer> predicate;

    public Accumulator(Predicate<Integer> predicate) {
        this.predicate = predicate;
        list = new LinkedList<>();
    }

    public void add(Pair pair) {
        if (isPossible()) {
            list.add(pair);
        }
    }

    public boolean isPossible() {
        return predicate.test(list.stream().mapToInt(Pair::value).reduce(Integer::sum).orElse(0));
    }

    public int accumulate() {
        return list.stream().mapToInt(Pair::value).reduce(Integer::sum).orElse(0);
    }

    public int[] indexes() {
        return list.stream().mapToInt(Pair::index).toArray();
    }
}
