package DesignPattern.singleton;

public class SingletonDesignPatternLazy {
    private static Employees emp = null;
    private SingletonDesignPatternLazy(){}
    public static synchronized Employees getEmployeeInstance(){
        if(emp == null){
            synchronized (Employees.class){
                if(emp == null)
                emp = new Employees();
            }
        }
        return emp;
    }
}
