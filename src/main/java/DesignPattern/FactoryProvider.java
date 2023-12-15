package DesignPattern;

import DesignPattern.abstractfactory.AbstractVehicleFactory;
import DesignPattern.abstractfactory.AutoFactory;
import DesignPattern.abstractfactory.BikeFactory;
import DesignPattern.abstractfactory.CarFactory;

public class FactoryProvider {
    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("car")){
            return new CarFactory();
        }else if(factoryType.equalsIgnoreCase("auto")){
            return new AutoFactory();
        }else if(factoryType.equalsIgnoreCase("bike")){
            return new BikeFactory();
        }else{
            return new CarFactory();
        }
    }
}
