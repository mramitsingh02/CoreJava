package com.bridgedesign.case1;

public class Bike extends Vehicle {
    private final Produce produce;
    private final Assemble assemble;

    public Bike(Produce produce, Assemble assemble) {
        super(produce, assemble);
        this.produce = produce;
        this.assemble = assemble;
    }

    @Override
    public void manufacture() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Bike.........");
        produce.work();
        assemble.work();
    }
}
