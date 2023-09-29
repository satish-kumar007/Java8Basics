package scaler.problems25092023;

public class CheckSqrt {
    public static void main(String[] args) {
        System.out.println(chechPerfactSquare(10));
    }

    public static int chechPerfactSquare(int A){
        int i=1;
        int sqrt = 0;
        while(i*i <= A){
            if(i*i == A){
                sqrt=(int)Math.sqrt(A);
            }else{
                sqrt = -1;
            }
            i++;
        }
        return sqrt;
    }
}
