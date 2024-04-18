package com.tester.solution;

public class TestArithmeticOpt {
    public static void main(String[] args) {
        ArithmeticOpt add = Double::sum;
        ArithmeticOpt sub = (a, b) -> a - b;
        ArithmeticOpt mul = (a, b) -> a * b;
        ArithmeticOpt div = (a, b) -> a / b;

        System.out.println("Addition: " + add.calculate(10.0, 5.0));
        System.out.println("Subtraction: " + sub.calculate(10.0, 5.0));
        System.out.println("Multiplication: " + mul.calculate(10.0, 5.0));
        System.out.println("Division: " + div.calculate(10.0, 5.0));
    }
}
