package com.tester.java8.collection.stream.case10;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPersonReduceMain {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Max", 23),
                new Person("Tony", 12),
                new Person("Peter", 17),
                new Person("Jone", 33),
                new Person("Mak", 45),
                new Person("Max", 43),
                new Person("Peter", 23),
                new Person("Pamela", 47)
        );
        System.out.println("----->");
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
        /*System.out.println("----->");
        test6(personList);
        System.out.println("----->");
        test7(personList);
        System.out.println("----->");
        test8(personList);
        System.out.println("----->");
        test9(personList);*/
    }

    private static void test9(List<Person> personList) {
        Collector<Person, StringJoiner, String> of = Collector.of(
                () -> new StringJoiner(" , "),
                (l, p) -> l.add(p.name.toUpperCase() + ":" + p.getAge()),
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
        Map<Integer, String> collect = personList.stream().collect(Collectors.toMap(p -> p.getAge(), p -> p.name, (name1, name2) -> name1 + ";" + name2));
        System.out.println(collect);
    }

    private static void test6(List<Person> personList) {
        String collect = personList.stream().filter(p -> p.getAge() > 18).map(p -> p.name).collect(Collectors.joining(", ", " In India ", " are the legal age"));
        System.out.println(collect);
    }


    private static void test5(List<Person> personList) {
        Integer reduce = personList.parallelStream().reduce(0, (sum, p) -> {
            System.out.format("Accumulator: Sum=%s, Person=%s , Age: %s \n", sum, p, p.getAge());
            return sum += p.age;
        }, (sum1, sum2) -> {
            int finalSum = sum1 + sum2;
            System.out.format("Combiner: Sum1=%s, Sum2=%s, Result= %s, Thread=%s \n", sum1, sum2, finalSum, Thread.currentThread().getName());
            return finalSum;
        });
        System.out.println(reduce);
    }

    private static void test4(List<Person> personList) {
        Integer reduce = personList.stream().reduce(0, (sum, p) -> {
            System.out.format("Accumulator: Sum=%s, Person =%s , Age: %s \n", sum, p, p.getAge());
            return sum += p.age;
        }, (sum1, sum2) -> {
            System.out.format("Combiner: Sum1=%s, Sum2=%s ", sum1, sum2);
            return sum1 + sum2;
        });
        System.out.println(reduce);
    }

    private static void test3(List<Person> personList) {
        Integer reduce = personList.stream().reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);
        System.out.println(reduce);
        System.out.println("----->");
        String reduce1 = personList.stream().reduce("",
                (l, p) -> l += p.name + ", ",
                (p1, p2) -> p1 + ":" + p2
        );
        System.out.println(reduce1);
    }

    private static void test2(List<Person> personList) {
        Person result = personList.stream().reduce(new Person("", 0), (p1, p2) -> {
            p1.age += p2.age;
            p1.name += p2.name + ", ";
            return p1;
        });

        System.out.println("Result Person : " + result.name + ", Total Age :" + result.age);

    }

    private static void test1(List<Person> personList) {
        personList
                .stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);
    }

    static class Person {
        String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.setAge(age);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}