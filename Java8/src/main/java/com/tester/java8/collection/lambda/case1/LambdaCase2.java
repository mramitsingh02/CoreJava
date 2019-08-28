package com.tester.java8.collection.lambda.case1;

public class LambdaCase2 {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer i1 = converter.convert("123");
        System.out.println(i1);

        Converter<String, Integer> converter0 = Integer::valueOf;
        Integer i2 = converter0.convert("200");
        System.out.println(i2);

        SomeFunction someFunction = new SomeFunction();
        Converter<String, String> converter1 = someFunction::startWith;
        String startWith = converter1.convert("Amit");
        System.out.println(startWith);


        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("Amit", "Singh");
        System.out.println(person);


    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    @FunctionalInterface
    public static interface Converter<F, T> {
        T convert(F from);
    }

    public static class Person {
        public String firstName;
        public String lastName;

        public Person() {
        }

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

    public static class SomeFunction {
        public String startWith(String fullString) {
            return String.valueOf(fullString.charAt(0));
        }
    }
}