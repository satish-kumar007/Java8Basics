package coreJava.loops;

public class Casting {
    public static void main(String[] args) {
        long l = 10000000000L;
        int x = (int)100000000000L;
        System.out.println(x);

        int a = 100000;
        int b = 400000;
        long c = (long)a*b;
        System.out.println(c);

        double d = Double.NaN;
        
    }
}
