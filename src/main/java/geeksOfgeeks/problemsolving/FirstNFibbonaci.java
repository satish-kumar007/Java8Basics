package geeksOfgeeks.problemsolving;

public class FirstNFibbonaci {
    public static void main(String[] args) {
        long[] fib = printFibb(7);
        for(Long l : fib){
            System.out.print(l+" ");
        }
    }

    public static long[] printFibb(int n){
        //Your code here
        long[] res = new long[n];

        for(int i=3;i<=n;i++){
            int sum = i+(i+1);
            res[0] = 1L;
            res[1] = 1L;
            res[i] = sum;
        }
        return res;
    }
}
