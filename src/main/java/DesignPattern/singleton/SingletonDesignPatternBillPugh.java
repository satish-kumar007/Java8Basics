package DesignPattern.singleton;

public class SingletonDesignPatternBillPugh {

    private SingletonDesignPatternBillPugh(){}

    private static class SingletonHelper{
        private static final Employees INSTANCE = new Employees();
    }

    public static synchronized Employees getEmployeeInstance(){
        return SingletonHelper.INSTANCE;
    }
}
