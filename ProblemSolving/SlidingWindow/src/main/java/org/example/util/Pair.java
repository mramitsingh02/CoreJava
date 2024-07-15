package org.example.util;

public record Pair(int index, int value) {

    public static Pair of(int index, int value) {
        return new Pair(index, value);
    }
}
