package scaler.DSProblem_08_12_2023;

public class PowerFunction {

    public static void main(String[] args) {
        int x = pow(-1,1,20);
        System.out.println(x);
        //System.out.println(-1%20);
    }
    public static int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int num = pow(A,B);
        if(num < 0){
            num = C+num;
        }
        System.out.println(num);
        return num;
    }

    public static int pow(int A, int B){
        if(B == 0){
            return 1;
        }
        return pow(A, B-1)*A;
    }
}
