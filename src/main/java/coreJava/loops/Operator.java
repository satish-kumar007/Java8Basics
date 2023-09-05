package coreJava.loops;

public class Operator {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 20;
        a += b -= c *= d /= 20;
        System.out. println("A = " + a + " B = " + b + " C = " + c + " D = " + d);

        int x = 5;
        x+=1;
        x*=x*x;
        System.out.println(x);

    }
}
