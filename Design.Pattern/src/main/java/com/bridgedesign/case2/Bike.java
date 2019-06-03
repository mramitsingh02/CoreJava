package com.bridgedesign.case2;

import com.google.inject.Inject;

public class Bike extends Vehicle {
    @Inject
    public Bike(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("ManuFacturing Bike");
        workShop1.work();
        workShop2.work();
    }
}
