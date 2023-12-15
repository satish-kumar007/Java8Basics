package DesignPattern.abstractfactory;

public class CarFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("mini")){
            return new MiniCar();
        }else if(type.equalsIgnoreCase("micro")){
            return new MicroCar();
        }else if(type.equalsIgnoreCase("mega")){
            return new MegaCar();
        }else{
            return new MiniCar();
        }
    }
}
