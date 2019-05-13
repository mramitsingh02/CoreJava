package com.bridgedesign;

public class BridgeDesignDemo {
    public static void main(String[] args) {
        Vehicle vehical = new Car(new Produce(), new Assemble());
        vehical.manufacture();
        Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
        vehicle2.manufacture();
    }
}
