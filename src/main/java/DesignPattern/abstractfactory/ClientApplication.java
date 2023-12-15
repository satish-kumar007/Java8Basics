package DesignPattern.abstractfactory;

import DesignPattern.FactoryProvider;

public class ClientApplication {
    public static void main(String[] args) {
        int distance = 100;
        AbstractVehicleFactory factory = FactoryProvider.getVehicleFactory("car");
        Vehicle miniCar = factory.getVehicle("mini");
        miniCar.book(distance);
    }
}
