package com.tester.main;

public class UniaryOperator {

    public static void main(String[] args) {
        String name = "Amit";
        //  String updateName = name;
        String updateName = name != null ? name.equals("Amit") ? "Jitu" : "Amit" : "";
        System.out.println(updateName.toUpperCase());


    }

}
