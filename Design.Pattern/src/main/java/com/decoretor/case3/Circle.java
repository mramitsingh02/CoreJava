package com.decoretor.case3;


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
