package com.tester.java8.collection.stream.case3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMain {
    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb4");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //Print all Data.
        System.out.println("-->Print all Data..");

        stringCollection.stream().forEach(System.out::println);
        System.out.println("-->Print only 'a' started Data..");

        //Print only a started Data
        stringCollection.stream().filter(item -> item.startsWith("a")).forEach(System.out::println);

        System.out.println("-->Print only 'b' started data and sort");
        stringCollection.stream().filter(item -> item.startsWith("b")).sorted().forEach(System.out::println);

        //Print data in upper case and descending order.
        System.out.println("-->Print data in upper case and descending order.");
        stringCollection.stream().map(String::toUpperCase).sorted((a, b)-> b.compareTo(a)).forEach(System.out::println);

        boolean anyMatch = stringCollection.stream().anyMatch(x -> x.startsWith("a"));
        System.out.println("--> Printed match condition :" + anyMatch);

        boolean noneMatch = stringCollection.stream().noneMatch(x -> x.startsWith("z"));
        System.out.println("--> Printed non match condition :" + noneMatch);

        boolean allMatch = stringCollection.stream().allMatch(x -> x.length() >= 3);
        System.out.println("--> Printed all match condition :" + allMatch);


        long count = stringCollection.stream().filter(x -> x.startsWith("b")).count();
        System.out.println("--> Print all match count :" + count);


        System.out.println("--> Print all match reduce :" + count);
        Optional<String> reduce = stringCollection.stream().sorted().reduce((s1, s2) -> s1 + "#" + s2);
        reduce.ifPresent(System.out::println);


    }
}
