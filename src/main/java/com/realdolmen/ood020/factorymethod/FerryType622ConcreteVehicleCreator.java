package com.realdolmen.ood020.factorymethod;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public class FerryType622ConcreteVehicleCreator implements FactoryVehicleCreator{


    @Override
    public Vehicle createVehicle(Boolean type, int noPass, String reg, int berths) {
        Vehicle v;
        if (type) {
            v = new Vehicle(noPass, reg);
        } else {
            v = new Truck(noPass, reg, berths);
        }
        return v;
    }
}
