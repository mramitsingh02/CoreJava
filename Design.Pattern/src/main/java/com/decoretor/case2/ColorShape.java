package com.decoretor.case2;


public class ColorShape implements Shape {
    private Shape shape;
    private String color;

    public ColorShape() {
    }

    public ColorShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " having " + color + " Color.";
    }
}
