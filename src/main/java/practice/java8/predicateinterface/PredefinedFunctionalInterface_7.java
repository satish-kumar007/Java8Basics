package practice.java8.predicateinterface;

import java.util.function.Predicate;

//Program to grant entry on a pub for Software Engineer
class SoftwareEngineer{
    String name;
    int age;
    boolean haveGirlFriend;

    public SoftwareEngineer(String name, int age, boolean haveGirlFriend) {
        this.name = name;
        this.age = age;
        this.haveGirlFriend = haveGirlFriend;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haveGirlFriend=" + haveGirlFriend +
                '}';
    }
}
public class PredefinedFunctionalInterface_7 {
    public static void main(String[] args) {
        SoftwareEngineer[] engineers = {
                new SoftwareEngineer("satish",37,false),
                new SoftwareEngineer("Narender",31,true),
                new SoftwareEngineer("Sheena",10,false),
                new SoftwareEngineer("Joe",17,true),
                new SoftwareEngineer("John",19,true),
                new SoftwareEngineer("Maria",27,false)
        };

        Predicate<SoftwareEngineer> allowed = se -> se.age >= 18 && se.haveGirlFriend==true;
        for(SoftwareEngineer soft : engineers){
            if(allowed.test(soft)){
                System.out.println("Allowed :: "+soft.name);
            }else{
                System.out.println("No allowed :: "+soft.name);
            }
        }
     }
}
