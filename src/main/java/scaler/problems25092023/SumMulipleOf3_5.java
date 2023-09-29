package scaler.problems25092023;

public class SumMulipleOf3_5 {
    public static void main(String[] args) {
         int sum = 0;
         //3,6,9,12,15,5,10,15

         for(int i = 1;i<=15;i++) {
             if (i % 3 == 0 || i % 5 == 0) {
                 sum = sum + i;
             }
         }
        System.out.println(sum);
    }
}
