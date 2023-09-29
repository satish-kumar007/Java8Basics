package scaler.problems180923;

public class PowOf2 {
    public static void main(String[] args) {
        int n=1;
        int pow = 1;
        int num = 2;
        boolean result = false;
        // Your code here
        for(int i=1;i<=n;i++){
            pow = pow*num;
            if(pow == n){
                result = true;
                break;
            }else{
                result = false;
            }
        }
        System.out.println(result);
    }

    public static boolean isPowerofTwo(long n){
        int pow = 1;
        int num = 2;
        boolean result = false;
        // Your code here
        if(n==1){
            result = true;
        }else{
            for(int i=1;i<=n;i++){
                pow = pow*num;
                if(pow == n){
                    result = true;
                    break;
                }else{
                    result = false;
                }
            }
        }

        return result;
    }
}
