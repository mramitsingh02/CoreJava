package com.bridgedesign.case1;

public abstract class Vehicle {
    private WorkShop workShop1;
    private WorkShop workShop2;
    public Vehicle(WorkShop workShop1, WorkShop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }
    public abstract void manufacture();
}
