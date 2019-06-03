package com.decoretor.case3;


public class DecoratorDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColorShape redCircle = new ColorShape(() -> circle, "Red");
        TransparencyShape transparencyShape = new TransparencyShape(() ->new ColorShape(() -> new Circle(10),"Green"), 30);
        System.out.println(circle.info());
        System.out.println(redCircle.info());
        System.out.println(transparencyShape.info());
    }
}
