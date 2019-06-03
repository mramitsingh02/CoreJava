package com.bridgedesign.case2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class BridgeDesignDemo {
    public static void main(String[] args) {
        // use the google guice for dependency injection.
        // https://www.tutorialspoint.com/guice/guice_named_binding.htm
        Injector vehicelInjector = Guice.createInjector(new VehicelModule());
        Vehicle vehicle = vehicelInjector.getInstance(Vehicle.class);
        vehicle.manufacture();
    }

}
