package com.tester.algorithm.array;

import com.tester.sort.SortUtils;

import java.util.Arrays;
import java.util.function.Predicate;

public class PrintOddEven {
    public static void main(String[] args) {
        PrintOddEven thisInstance = new PrintOddEven();
        approach1(SortUtils.elements);
        approach2(SortUtils.elements);
        approach3(SortUtils.elements);
    }

    public static void approach3(int[] elements) {
        System.out.println("=================Odd Number==================");
        Arrays.stream(elements).filter(x -> x % 2 == 1).forEach(System.out::println);
        System.out.println("=================Even Number==================");
        Arrays.stream(elements).filter(x -> x % 2 == 0).forEach(System.out::println);
    }

    public static void approach2(int[] elements) {
        PrintOddEven thisInstance = new PrintOddEven();
        Predicate<Integer> oddPredicate = (x) -> x % 2 == 0;
        Predicate<Integer> evenPredicate = (x) -> x % 2 == 1;

        System.out.println("=================Odd Number==================");
        thisInstance.print(elements, oddPredicate);
        System.out.println("=================Even Number==================");
        thisInstance.print(elements, evenPredicate);
    }

    public static void approach1(int[] elements) {
        PrintOddEven thisInstance = new PrintOddEven();
        System.out.println("=================Odd Number==================");
        thisInstance.printOdd(elements);
        System.out.println("=================Even Number==================");
        thisInstance.printEven(elements);
    }

    public void print(int[] elements, Predicate<Integer> oddPredicate) {
        for (int i = 0; i < elements.length; i++) {
            if (oddPredicate.test(elements[i])) {
                System.out.println(elements[i]);
            }
        }

    }

    private void printEven(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                System.out.println(elements[i]);
            }
        }
    }

    public void printOdd(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 1) {
                System.out.println(elements[i]);
            }
        }
    }
}
