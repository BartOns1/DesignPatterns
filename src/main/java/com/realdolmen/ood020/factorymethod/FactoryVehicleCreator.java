package com.realdolmen.ood020.factorymethod;

/**
 * Created by vdabcursist on 11/08/2017.
 */
public interface FactoryVehicleCreator {


    public Vehicle createVehicle(Boolean type, int nPassangers, String reg, int berths);
}


