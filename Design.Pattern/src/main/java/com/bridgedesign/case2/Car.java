package com.bridgedesign.case2;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Car extends Vehicle {
    @Inject
    public Car(@Named("workShop1") WorkShop workShop1, @Named("workShop2")WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("ManuFacturing Car");
        workShop1.work();
        workShop2.work();
    }
}
