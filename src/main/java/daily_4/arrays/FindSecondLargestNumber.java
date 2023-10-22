package daily_4.arrays;

import java.util.Arrays;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {45,6,7,89,12,34,67};
        int n = arr.length;
        if(n<2){
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(arr);//sort the array to asc
        for(int i=n-2;i>=0;i--){//traverse from second largest to 0 element
            if(arr[i] != arr[n-1]){// here arr[i] hold the second largest, comparing this with first for equality.
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
