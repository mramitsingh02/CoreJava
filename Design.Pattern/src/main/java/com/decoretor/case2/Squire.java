package com.decoretor.case2;

public class Squire implements Shape {
    private String side;

    public Squire() {

    }

    public Squire(String side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "Squire With Side : " + side;
    }
}
