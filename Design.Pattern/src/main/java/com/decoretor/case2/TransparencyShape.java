package com.decoretor.case2;

public class TransparencyShape implements Shape {
    private int transparency;
    private Shape shape;

    public TransparencyShape() {

    }

    public TransparencyShape(Shape shape, int transparency) {
        this.transparency = transparency;
        this.shape = shape;
    }

    @Override
    public String info() {
        return shape.info() + " has transparency " + transparency + "%";
    }
}
