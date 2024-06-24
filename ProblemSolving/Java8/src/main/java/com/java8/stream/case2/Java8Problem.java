package com.java8.stream.case2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.java8.stream.util.Utils.printHeader;

public class Java8Problem {
    public static void main(String[] args) {
        que01();
        que02();
        que03();
        que04();
        que05();
        que06();
        que07();
        que08();
        que09();
        que10();
        que11();
        que12();
        que13();
        que14();
        que15();
        que16();
        que17();
        que18();
        que19();
        que20();
        que21();
    }

    private static void que01() {
        printHeader("1- Write a Java Program to find whether a number is prime or not.");

        int input = 17;
        System.out.println(checkPrimeNumber(input));
    }

    private static boolean checkPrimeNumber(int input) {
        if (input == 0 || input == 1) {
            return false;
        }
        return IntStream.rangeClosed(2, input / 2).noneMatch(x -> input % x == 0);
    }

    private static void que02() {
        printHeader("2-Write a Java Program to check Armstrong numbers.");

    }

    private static void que03() {
        printHeader("3- Write a program to print duplicate numbers.");
    }

    private static void que04() {
        printHeader("4-Write a program to find whether a string or number is palindrome or not.");
    }

    private static void que05() {
        printHeader("5- Write a program to print duplicate strings.");
        String input = "JavaAPI";
        char firstNotRepetedChar = input.chars()
                .mapToObj(x -> Character.toUpperCase((char) x))//converting the object format
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))// find duplicate freq in linkedHashMap
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1L)
                .map(x -> x.getKey())
                .findFirst()
                .get();//filtering the freq which is not first time

        System.out.println("First non repeated char  : " + firstNotRepetedChar);
    }

    private static void que06() {
        printHeader("6- Write a program to print the Fibonacci Series.");
        System.out.println(Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]}).limit(10).map(f -> f[0]).map(String::valueOf).collect(Collectors.joining(",")));
    }

    private static void que07() {
        printHeader("7- Write a program to find min and max numbers in the array.");
        int arr[] = {2, 3, 1, 22, 11, 33, 5};
        Arrays.stream(arr).boxed().max(Integer::compare).map(x -> "Max " + x).ifPresent(System.out::println);
        Arrays.stream(arr).boxed().min(Integer::compare).map(x -> "Min " + x).ifPresent(System.out::println);
    }

    private static void que08() {
        printHeader("8-Write a program to find Min And Max In an Array Without using the max function");
        int arr[] = {2, 3, 1, 22, 11, 33, 5};
        System.out.println("Max " + Arrays.stream(arr).boxed().reduce(Integer.MIN_VALUE, Math::max).intValue());
        System.out.println("Min " + Arrays.stream(arr).boxed().reduce(Integer.MAX_VALUE, Math::min).intValue());
    }

    private static void que09() {
        printHeader("9-Write a program to find the second-highest number in an array.");
        int a[] = {3, 6, 32, 1, 8, 5, 31, 22, 2};
        Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }

    private static void que10() {
        printHeader("10- Write a program to Find the Second Lowest Number.");
        int a[] = {3, 6, 32, 1, 8, 5, 31, 22, 2};
        Arrays.stream(a).boxed().sorted().skip(1).findFirst().ifPresent(System.out::println);
    }

    private static void que11() {
        printHeader("11- Write a program to print the First Not Repeated Char in string.");
        String input = "Java Stream API is very good concept";
        Arrays.stream(input.split("")).map(String::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }

    private static void que12() {
        printHeader("12- Write a program to a Flattering list of objects.");
        List<Integer> oddList = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> evenList = Arrays.asList(2, 4, 6, 8, 10);
        List<List<Integer>> listOfList = Arrays.asList(oddList, evenList);
        listOfList.stream().flatMap(Collection::stream).forEach(System.out::println);
    }

    private static void que21() {
        String input = "Java Stream API is very good concept";


        input.chars()
                .mapToObj(x -> Character.toUpperCase((char) x))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().ifPresent(System.out::println);
    }

    private static void que13() {
        printHeader("13- Write a program to find the majority element in an array.");
        int[] majorityArray = {5, 3, 2, 1, 2, 4, 3, 2, 2, 6, 2, 3, 2, 2, 2};
        int[] notMajorityArray = {3, 6, 32, 1, 8, 5, 31, 22};

        printMajorityElementByJava8(majorityArray);
        printMajorityElementByJava8(notMajorityArray);
        Integer majorityOf = printMajorityElement(majorityArray);
        System.out.println(majorityOf);

        majorityOf = printMajorityElement(notMajorityArray);
        System.out.println(majorityOf);
    }

    private static Integer printMajorityElement(int[] majorityArray) {
        Integer majorityOf = Arrays.stream(majorityArray)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() >= majorityArray.length / 2)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
        return majorityOf;
    }

    private static void que14() {
        printHeader("14- Write a program to Print Even and Odd Numbers.");

        Map<Boolean, List<Integer>> numbers = IntStream.rangeClosed(1, 50).boxed()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        for (Map.Entry<Boolean, List<Integer>> booleanListEntry : numbers.entrySet()) {
            System.out.println(booleanListEntry.getKey() + " = " + booleanListEntry.getValue());
        }

    }

    private static void printMajorityElementByJava8(int[] a) {
        int majorityElement = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting())).entrySet()
                .stream().filter(k -> k.getValue() >= a.length / 2).map(Map.Entry::getKey).findFirst().orElse(0);
        System.out.println(majorityElement);
    }

    private static void que15() {
        printHeader("5- Write a program to sort the 2 arrays in ascending order.");
        int[] i = {4, 5, 13, 22};
        int[] j = {0, 9, 3, 7, 12, 11};

        IntStream.concat(Arrays.stream(i), Arrays.stream(j)).boxed().sorted().forEach(System.out::println);

    }

    private static void que16() {
        printHeader("16-Write a program to sort the array.");
        int[] a = {3, 6, 32, 1, 8, 5, 31, 22};

        Arrays.stream(a)
                .boxed()
                .sorted(Comparator.comparingInt(Integer::intValue))
                .forEach(System.out::println);

    }

    private static void que17() {
        printHeader("17-Write a program to sum an array.");
        int[] a = {3, 6, 32, 1, 8, 5, 31, 22};
        System.out.println(Arrays.stream(a)
                .boxed()
                .collect(Collectors.summingInt(Integer::intValue)));
        System.out.println((Integer) Arrays.stream(a)
                .boxed().mapToInt(Integer::intValue).sum());
    }

    private static void que18() {
        printHeader("18-Write a program to sum an array without using the sum method.");
        int[] a = {3, 6, 32, 1, 8, 5, 31, 22};
        System.out.println(Arrays.stream(a)
                .boxed()
                .collect(Collectors.reducing(0, (x, y) -> x + y)));
    }

    private static void que19() {
        printHeader("19- Write a program to append char in char ex-input- {A, B, C} output->[A_X, B_Y, C_Z].");
        Stream<Character> charStream = Stream.of('A', 'B', 'C');
        charStream.map(v -> v + "_" + (char) (v + 23))
                .forEach(System.out::println);

    }

    private static void que20() {
        printHeader("20-Write a program to find the only duplicate count list in the List.");
        List<String> names = Arrays.asList("Java", "Spring", "JPA", "Java", "Cloud", "JPA");

        names.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(key -> key.getValue() > 1)
                .forEach((K) -> System.out.println(K.getKey() + " = " + K.getValue()));

    }
}
