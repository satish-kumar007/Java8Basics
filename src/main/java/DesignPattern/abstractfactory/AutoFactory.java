package DesignPattern.abstractfactory;

public class AutoFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.equalsIgnoreCase("personal")){
            return new PersonalAuto();
        }else if(type.equalsIgnoreCase("shared")){
            return new SharedAuto();
        }else{
            return new PersonalAuto();
        }
    }
}
