package com.tester.pazzel.case1;

import java.util.stream.Stream;

public enum Fruits {
    MANGO("a"), BANANA("b"), GUAVA("c"), GRAPES("d"), COCONUT("f"), DTYTRF("g");
    private String fruitName;

    Fruits(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return fruitName;
    }

    public static Stream<Fruits> stream() {
        return Stream.of(Fruits.values());
    }

    public static boolean hasFruit(String fruitName) {
        return Fruits.stream().filter(f -> f.toString().equals(fruitName)).findFirst().isPresent();
    }
}
