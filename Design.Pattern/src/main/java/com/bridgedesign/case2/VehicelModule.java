package com.bridgedesign.case2;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class VehicelModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(WorkShop.class).annotatedWith(Names.named("workShop1")).to(Produce.class);
        bind(WorkShop.class).annotatedWith(Names.named("workShop2")).to(Assemble.class);
        bind(Vehicle.class).to(Car.class);
    }
}
