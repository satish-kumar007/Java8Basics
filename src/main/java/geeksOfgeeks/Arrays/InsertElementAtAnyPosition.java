package geeksOfgeeks.Arrays;

import java.util.Scanner;

public class InsertElementAtAnyPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();
        int element = sc.nextInt();
        int index = pos-1;
        int[] arr = {2,3,4,5,6,7,8,9};
        int[] ans = new int[arr.length+1];
        if(arr.length < pos){
            System.out.println("Array size is less than position");
            return;
        }
        System.out.print("Original array:: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }
        for(int i = index;i<arr.length;i++){
            ans[i+1] = arr[i];
        }
        ans[index] = element;

        System.out.println();
        System.out.print("After insertion:: ");
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
