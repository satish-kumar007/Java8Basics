package DesignPattern.factory.example1;

public class GetPlan {

    public Plan getPlan(String type){
        if(type.equalsIgnoreCase("domestic")){
            return new Domestic();
        }else if(type.equalsIgnoreCase("commercial")){
            return new Commercial();
        }else if(type.equalsIgnoreCase("institutional")){
            return new Institutional();
        }else if(type.equalsIgnoreCase("government")){
            return new Government();
        }else{
            return null;
        }
    }
}
