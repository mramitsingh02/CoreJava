package com.decoretor.case2;

public class Circle implements Shape {
    private float radius;

    public Circle() {

    }

    public Circle(float radius) {
        this.radius = radius;
    }


    @Override
    public String info() {
        return "Circle with radius : " + radius;
    }



}
