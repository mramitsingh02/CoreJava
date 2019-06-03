package com.decoretor.case2;


public class DecoratorDemo {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        ColorShape redCircle = new ColorShape(circle, "Red");
        TransparencyShape transparencyShape = new TransparencyShape(redCircle, 30);

        System.out.println(circle.info());
        System.out.println(redCircle.info());
        System.out.println(transparencyShape.info());

    }
}
