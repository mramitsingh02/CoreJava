package com.tester.java8.collection.stream.case7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamToFlatMapMain {

    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test1() {
        List<Foo> foos = new ArrayList<>();
        IntStream.range(1, 10).forEach(x -> foos.add(new Foo("Foo" + x)));
        foos.forEach(f -> IntStream.range(1, 4).forEach(num -> f.list.add(new Bar("Bar" + num + " <- " + f.name))));
        foos.stream().flatMap(x -> x.list.stream()).forEach(b -> System.out.println(b.name));
    }

    private static void test2() {
        IntStream.range(1, 10)
                .mapToObj( x -> new Foo("Foo" + x))
                .peek(f -> IntStream.range(1,4 )
                        .mapToObj(s -> new Bar("Bar" + s + " <- " + f.name)).forEach(f.list::add))
                .flatMap(x -> x.list.stream())
                .forEach(System.out::println);

    }

    static class Foo {
        String name;
        List<Bar> list = new ArrayList<>();

        public Foo(String name) {
            this.name = name;
        }

        public List<Bar> getList() {
            return list;
        }

        public void setList(List<Bar> list) {
            this.list = list;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Foo{" +
                    "name='" + name + '\'' +
                    ", list=" + list +
                    '}';
        }
    }

    static class Bar {
        private String name;

        public Bar(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Bar{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}