package com.bridgedesign.case2;

import com.google.inject.Inject;

public class Bus extends Vehicle {
    @Inject
    public Bus(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("ManuFacturing Bus");
        workShop1.work();
        workShop2.work();
    }
}
