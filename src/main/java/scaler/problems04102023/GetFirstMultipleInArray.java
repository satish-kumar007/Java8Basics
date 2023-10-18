package scaler.problems04102023;

import java.util.Scanner;

public class GetFirstMultipleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = sc.nextInt();
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }
        int[] arr = new int[arr_size];

        System.out.println(":: "+arr.length);
        //firstMultiple(arr, x);
    }
    public static int firstMultiple(int[] arr, int x){
        int ans = -1;
        System.out.println(":: "+arr.length);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"  ::  "+j+"    ::  "+arr[j] % x);
            if(arr[j] % x == 0){
                ans = arr[j];
                break;
            }
        }
        System.out.println(ans);
        return ans;
    }
}
