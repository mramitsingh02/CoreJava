package com.bridgedesign.case1;

public class Car extends Vehicle {
    private final WorkShop produce;
    private final WorkShop assemble;

    public Car(WorkShop produce, WorkShop assemble) {
        super(produce, assemble);
        this.produce = produce;
        this.assemble = assemble;
    }

    @Override
    public void manufacture() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Car.........");

        produce.work();
        assemble.work();
    }
}
