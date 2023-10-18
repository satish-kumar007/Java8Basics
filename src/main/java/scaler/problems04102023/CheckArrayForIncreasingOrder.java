package scaler.problems04102023;

public class CheckArrayForIncreasingOrder {
    public static void main(String[] args) {
        int[] arr = {3,5,5,6,7,9};//true
        int[] arr_1 = {3,5,6,7,9,1};//false
        boolean b = checkForOrder(arr);
        System.out.println(b);

        boolean b1 = checkForOrder(arr_1);
        System.out.println(b1);

        boolean b2 = check(arr);
        System.out.println(b2);

    }
    public static boolean checkForOrder(int[] x){
        boolean status = false;
        for(int i=1;i<x.length;i++){
            if(x[i] < x[i-1]){
                status = false;
            }else{
                status = true;
            }
        }
        return status;
    }

    static boolean check(int[]arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }
}
