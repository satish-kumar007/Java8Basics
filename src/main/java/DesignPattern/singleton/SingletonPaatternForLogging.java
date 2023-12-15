package DesignPattern.singleton;

public class SingletonPaatternForLogging {

    private static SingletonPaatternForLogging logger = null;

    private SingletonPaatternForLogging(){}

    public synchronized SingletonPaatternForLogging getInstanceForLogger(){
        if(logger == null){
            synchronized (SingletonPaatternForLogging.class){
                if(logger == null)
                    logger= new SingletonPaatternForLogging();
            }
        }
        return logger;
    }

    public void log(String message){
        System.out.println(message  );
    }
}
