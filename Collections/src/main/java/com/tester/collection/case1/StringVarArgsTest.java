package com.tester.collection.case1;

public class StringVarArgsTest {
    public static void main(String[] args) {
        isNull("Amit", "Aditi", null, null);
    }
    public static void isNull(String... args) {

        for (String arg : args) {
            if(arg == null){
                System.out.println("Bas kar Boss, ab rulaye ga.");
                break;
            }
        }

    }

}
