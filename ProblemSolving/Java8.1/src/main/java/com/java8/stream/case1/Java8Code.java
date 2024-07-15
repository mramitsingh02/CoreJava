package com.java8.stream.case1;

import com.java8.stream.data.DataFactory;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static com.java8.stream.util.Utils.printHeader;

public class Java8Code {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87, 18);

        printHeader("1) Given a list of integers, separate odd and even numbers?");
        listOfIntegers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)).entrySet().forEach(System.out::println);

        printHeader("2) How do you remove duplicate elements from a list using Java 8 streams?");
        System.out.println(listOfIntegers);
        System.out.println(listOfIntegers.stream().distinct().map(String::valueOf).collect(Collectors.joining(", ", "[", "]")));

        printHeader("3) How do you find frequency of each character in a string using Java 8 streams?");
        String inputString = "Java Concept Of The Day";

        inputString.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().forEach(System.out::println);

        printHeader("4) How do you find frequency of each element in an array or a list?");
        List<String> stationeryList = DataFactory.getStationeryList();

        stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((s, aLong) -> System.out.println(s + " has " + aLong + " time."));
        printHeader("5) How do you sort the given list of decimals in reverse order?");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        decimalList.stream().sorted(Comparator.comparingDouble(Double::doubleValue).reversed()).forEach(System.out::println);

        printHeader("6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?");

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings.stream().collect(Collectors.joining(",", "[", "]")));

        printHeader("7) From the given list of integers, print the numbers which are multiples of 5?");
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers2.stream().filter(n -> n % 5 == 0).forEach(System.out::println);

        printHeader("8) Given a list of integers, find maximum and minimum of those numbers?");
        List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers3.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        listOfIntegers3.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        printHeader("9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?");

        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        printHeader("10) How do you merge two unsorted arrays into single sorted array without duplicates?");
        int[] a1 = new int[]{4, 2, 5, 1};

        int[] b1 = new int[]{8, 1, 9, 5};

        int[] c1 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1)).distinct().sorted().toArray();
        System.out.println(Arrays.toString(c1));

        printHeader("11) How do you get three maximum numbers and three minimum numbers from the given list of integers?");

        List<Integer> listOfIntegers4 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Three minimum numbare ");
        listOfIntegers4.stream().sorted().limit(3).forEach(System.out::println);
        listOfIntegers4.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        printHeader("12) Java 8 program to check if two strings are anagrams or not?");

        String s1 = "RaceCar";
        String s2 = "CarRace";

        String firstString = s1.chars().mapToObj(String::valueOf).sorted().collect(Collectors.joining(","));
        String secondString = s2.chars().mapToObj(String::valueOf).sorted().collect(Collectors.joining(","));
        if (firstString.equals(secondString)) {
            System.out.println("anagrams");
        } else {
            System.out.println("not anagrams");
        }


        printHeader("13) Find sum of all digits of a number in Java 8?");
        int value = 15623;

        Stream.of(String.valueOf(value).split("")).map(Integer::parseInt).reduce(Integer::sum).ifPresent(System.out::println);
        String.valueOf(value).chars().mapToObj(i -> (char) i).map(String::valueOf).map(Integer::parseInt).reduce(Integer::sum).ifPresent(System.out::println);

        printHeader("14) Find second largest number in an integer array?");

        List<Integer> listOfIntegers5 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers5.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

        printHeader("15) Given a list of strings, sort them according to increasing order of their length?");
        DataFactory.getCourseList().stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);


        printHeader("16) Given an integer array, find sum and average of all elements?");

        int[] a2 = new int[]{45, 12, 56, 15, 24, 75, 31, 89};
        System.out.println("Sum :" + Arrays.stream(a2).sum());
        System.out.println("Average :" + Arrays.stream(a2).average().getAsDouble());

        printHeader("17) How do you find common elements between two arrays?");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream().filter(list2::contains).forEach(System.out::println);

        printHeader("18) Reverse each word of a string using Java 8 streams?");
        String str = "Java Concept Of The Day";
        System.out.println(Arrays.stream(str.split(" ")).map(StringBuffer::new).map(StringBuffer::reverse).collect(Collectors.joining(" ")));

        printHeader("19) How do you find sum of first 10 natural numbers?");

        System.out.println(IntStream.iterate(1, i -> i + 1).limit(10).sum());

        printHeader("20) Reverse an integer array");
        List<Integer> list3 = Arrays.asList(71, 21, 34, 89, 56, 28);

        int[] a5 = new int[]{71, 21, 34, 89, 56, 28};
        System.out.println(Arrays.toString(IntStream.rangeClosed(1, a5.length).map(index -> a5[a5.length - index]).toArray()));

        printHeader("21) Print first 10 even numbers");

        System.out.println(IntStream.rangeClosed(1, 200).filter(x -> x % 2 == 0).limit(10).mapToObj(String::valueOf).collect(Collectors.joining(",")));

        printHeader("22) How do you find the most repeated element in an array?");

        Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil")
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst().ifPresent(x -> System.out.println(x.getKey()));

        printHeader("23) Palindrome program using Java 8 streams");
        String str2 = "ROTATOR";
        boolean isPalindrome = IntStream.range(0, str2.length() / 2).noneMatch(i -> str2.charAt(i) != str2.charAt(str2.length() - i - 1));
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        printHeader("24) Given a list of strings, find out those strings which start with a number?");
        List<String> listOfStrings6 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings6.stream().filter(x -> Character.isDigit(x.charAt(0))).forEach(System.out::println);


        printHeader("25) How do you extract duplicate elements from an array?");

        List<Integer> listOfIntegers7 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> duplicateNumber = new HashSet<>();

        listOfIntegers7.stream().filter(x -> !duplicateNumber.add(x)).forEach(System.out::println);

        printHeader("26) Print duplicate characters in a string?");

        String input = "Java Concept Of The Day";
        Set<String> uniqueChar = new HashSet<>();
        Stream.of(input.toCharArray()).map(String::valueOf).filter(s -> !uniqueChar.add(s)).forEach(System.out::println);

        printHeader("27) Find first repeated character in a string?");

        Map<String, Long> charCountMap =
                Arrays.stream(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String firstNonRepeatedChar = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();

        printHeader("29) Fibonacci series");
        Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
                .limit(10)
                .map(f -> f[0])
                .forEach(System.out::println);


        printHeader("30) First 10 odd numbers");

        IntStream.rangeClosed(1, 200).filter(x -> x %2 != 0).limit(10).forEach(System.out::println);


        printHeader("31) How do you get last element of an array?");
        listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        listOfStrings.stream().skip(listOfStrings.size() -1).findFirst().ifPresent(System.out::println);

        printHeader("32) Find the age of a person in years if the birthday has given?");

    }
}