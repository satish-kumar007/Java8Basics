package geeksOfgeeks.problemsolving;

public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(32));
    }
    public static boolean isPowerofTwo(long n){
        // Your code here
        //boolean ans = false;
        if(n == 0)
            return false;
        while(n != 1){
            System.out.println((n % 2 != 0)+"  n % 2 != 0 " + n+ "% 2");
            if(n % 2 != 0)
                return false;
            n = n/2;
        }

        return true;
    }
}
