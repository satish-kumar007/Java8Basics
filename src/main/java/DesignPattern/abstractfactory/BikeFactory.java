package DesignPattern.abstractfactory;

public class BikeFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("normal")){
            return new NormalBike();
        }else if(type.equalsIgnoreCase("sports")){
            return new SportsBike();
        }else{
            return new NormalBike();
        }
    }
}
