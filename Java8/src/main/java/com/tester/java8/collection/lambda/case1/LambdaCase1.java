package com.tester.java8.collection.lambda.case1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaCase1 {
    private static List<Person> people;

    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static void main(String[] args) {
        fillPersonData();
        List<Person> peopleNormal = LambdaCase1.people.stream().sorted(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge)).collect(Collectors.toList());

        peopleNormal.stream().map(Person::getName).forEach(System.out::println);
        System.out.println("------------------>");

        List<Person> people = LambdaCase1.people.stream().sorted(Comparator.comparing(Person::getName).thenComparing(Person::getAge)).collect(Collectors.toList());
        people.forEach(System.out::println);
        System.out.println("------------------>");

        List<String> names2 = Arrays.asList("peter", null, "anna", "mike", null, "xenia");
        names2.sort(Comparator.nullsLast(String::compareTo));
        System.out.println(names2);

        List<String> names3 = Arrays.asList("peter", null, "anna", "mike", null, "xenia");
        names3.sort(Comparator.nullsLast(String::compareTo).reversed());
        System.out.println(names3);

        List<String> names4 = Arrays.asList("peter", null, "anna", "mike", null, "xenia");
        names4.sort(Comparator.nullsFirst(String::compareTo));
        System.out.println(names4);



        /*List<String> names4 = null;

        Optional.ofNullable(names3).filter(x -> x != null).ifPresent(list -> list.sort(Comparator.naturalOrder()));

        System.out.println(names4);
*/

    }

    private static void fillPersonData() {
        people = Arrays.asList(
                new Person("Max", 23),
                new Person("Tony", 12),
                new Person("Peter", 17),
                new Person("Jone", 33),
                new Person("Mak", 45),
                new Person("Max", 43),
                new Person("Peter", 23),
                new Person("Pamela", 47)
        );
    }


}