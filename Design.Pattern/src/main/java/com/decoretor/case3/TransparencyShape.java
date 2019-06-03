package com.decoretor.case3;


import java.util.function.Supplier;

public class TransparencyShape<T extends Shape> implements Shape {
    private int transparency;
    private Shape shape;

    public TransparencyShape() {

    }

    public TransparencyShape(Supplier<? extends T> shape, int transparency) {
        this.shape = shape.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has transparency " + transparency + "%";
    }
}
