package com.java8.stream.util;

public class Utils {
    public static void main(String[] args) {
       testJava12();
    }

    public static void printHeader(String msg) {
        System.out.println();
        System.out.println("=".repeat(85));
        System.out.println(msg);
        System.out.println("=".repeat(85));
    }


    public static void testJava12(){
        String text = "Hello Baeldung!\nThis is Java 12 article.";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-10);
        System.out.println(text);


        String text2 = "Baeldung";
        String transformed = text2.transform(value ->
                new StringBuilder(value).reverse().toString()
        );
        System.out.println(transformed);

    }
}
