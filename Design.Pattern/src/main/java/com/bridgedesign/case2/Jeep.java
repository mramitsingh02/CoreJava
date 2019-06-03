package com.bridgedesign.case2;

import com.google.inject.Inject;

public class Jeep extends Vehicle {
    @Inject
    public Jeep(WorkShop workShop1, WorkShop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.println("ManuFacturing Jeep");
        workShop1.work();
        workShop2.work();
    }
}
