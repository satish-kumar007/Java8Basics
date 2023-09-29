package scaler.problems22092023;

public class TemperatureConversion {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        celsius= 36.8;
        fahrenheit =((celsius*9)/5)+32;
        System.out.println("Temperature in Fahrenheit is: "+Math.round(fahrenheit*100)/100d);
    }
}
