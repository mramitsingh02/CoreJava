package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.Arrays;

public class CopyArrayToAnotherArray {
    public static void main(String[] args) {
        CopyArrayToAnotherArray thisInstance = new CopyArrayToAnotherArray();
        int[] ints = thisInstance.copy(SortUtils.elements);
        boolean equals = Arrays.equals(ints, SortUtils.elements);
        if (equals) {
            System.out.println("Element are copies");
        }
    }

    public int[] copy(int [] elements) {
        return Arrays.copyOf(elements, elements.length);
    }

}
