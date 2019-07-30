package com.tester.java8.collection.stream.case9;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPersonProcessMain {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Max", 23),
                new Person("Tony", 12),
                new Person("Peter", 17),
                new Person("Jone", 33),
                new Person("Mak", 45),
                new Person("Max", 43),
                new Person("Peter", 23),
                new Person("Pamela", 45)
        );
        test1(personList);
        System.out.println("----->");
        test2(personList);
        System.out.println();
        System.out.println("----->");
        test3(personList);
        System.out.println("----->");
        test4(personList);
        System.out.println("----->");
        test5(personList);
        System.out.println("----->");
        test6(personList);
        System.out.println("----->");
        test7(personList);
        System.out.println("----->");
        test8(personList);
        System.out.println("----->");
        test9(personList);
    }

    private static void test9(List<Person> personList) {
        Collector<Person, StringJoiner, String> of = Collector.of(
                () -> new StringJoiner(" , "),
                (l, p) -> l.add(p.name.toUpperCase() + ":" + p.age),
                (p1, p2) -> p1.merge(p2),
                StringJoiner::toString
        );

        String personListString = personList.stream().collect(of);
        System.out.println(personListString);

    }

    private static void test8(List<Person> personList) {
        Collector<Person, StringJoiner, String> stringJoinerSupplier = Collector.of(
                () -> new StringJoiner(" | "),  //supplier
                (j, p) -> j.add(p.name.toUpperCase()),  //accumulator
                (j1, j2) -> j1.merge(j2),               //combiner
                StringJoiner::toString                  //finisher
        );

        String collect = personList.stream().collect(stringJoinerSupplier);
        System.out.println(collect);


    }

    private static void test7(List<Person> personList) {
        // Collectors.toMap("What will be key", "What will be value", "In case the key is duplicate how the value you want to keep in map")
        Map<Integer, String> collect = personList.stream().collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));
        System.out.println(collect);
    }

    private static void test6(List<Person> personList) {
        String collect = personList.stream().filter(p -> p.age > 18).map(p -> p.name).collect(Collectors.joining(", ", " In India ", " are the legal age"));
        System.out.println(collect);
    }


    private static void test5(List<Person> personList) {
        IntSummaryStatistics collect = personList.stream().filter(x -> x.name.startsWith("M")).collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(collect);
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
        System.out.println(collect.getSum());
        System.out.println(collect.getCount());
    }

    private static void test4(List<Person> personList) {
        IntSummaryStatistics collect = personList.stream().collect(Collectors.summarizingInt(p -> p.age));
        System.out.println(collect);
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
        System.out.println(collect.getSum());
        System.out.println(collect.getCount());
    }

    private static void test3(List<Person> personList) {
        Double collect = personList.stream().collect(Collectors.averagingInt(p -> p.age));
        System.out.println(collect);
    }

    private static void test2(List<Person> personList) {
        Map<Integer, List<Person>> listMap = personList.stream().collect(Collectors.groupingBy(x -> x.age));
        listMap.forEach((age, p) -> System.out.format("%d : %s", age, p));

    }

    private static void test1(List<Person> personList) {
        List<Person> people = personList.stream().filter(x -> x.name.startsWith("P")).collect(Collectors.toList());
        people.forEach(System.out::println);
    }

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}