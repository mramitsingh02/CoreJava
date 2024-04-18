package com.tester.solution;

public record Customer(long id, String name, String email) {

    Customer(long id, String name){
        this(id, name, "");
    }



}
