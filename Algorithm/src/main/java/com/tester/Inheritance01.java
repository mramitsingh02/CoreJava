package com.tester;

public class Inheritance01 {

    public void m1(byte param){
        System.out.println("byte");
    }

    public void m1(int param){
        System.out.println("byte");
    }

    public static void main(String[] args) {
        Inheritance01 inheritance01 = new Inheritance01();
        inheritance01.m1((byte) 0);
        inheritance01.m1('a');
        inheritance01.m1(1);
       // inheritance01.m1(11l);
    }
}
