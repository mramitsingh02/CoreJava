package com.decoretor.case3;


import java.util.function.Supplier;

public class ColorShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColorShape() {
    }

    public ColorShape(Supplier<? extends T> shape, String color) {
        this.shape = shape.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " having " + color + " Color.";
    }
}
