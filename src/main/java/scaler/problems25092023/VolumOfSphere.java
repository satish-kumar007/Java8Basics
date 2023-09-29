package scaler.problems25092023;

public class VolumOfSphere {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }
    public static int solve(final int A) {
        double volum = 0;
        double radius = A;
        volum = (4 * Math.PI * Math.pow(radius,3.0))/3.0;
        return (int)Math.ceil(volum);
    }

}
