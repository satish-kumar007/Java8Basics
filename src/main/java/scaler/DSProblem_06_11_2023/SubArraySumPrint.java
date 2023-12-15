package scaler.DSProblem_06_11_2023;

import java.util.Scanner;

public class SubArraySumPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int[] psum = prefSum(arr);
        for(int s=0;s<n;s++){
            long sum = 0;
            for(int e=s;e<n;e++){
                if(s==0){
                    sum = psum[e];
                }else{
                    sum = psum[e] - psum[s-1];
                }
                System.out.print(sum+" ");
            }
            //System.out.println();
        }

    }
    public static int[] prefSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
