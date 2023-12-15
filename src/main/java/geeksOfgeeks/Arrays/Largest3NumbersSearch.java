package geeksOfgeeks.Arrays;

import java.util.Arrays;

public class Largest3NumbersSearch {
    public static void main(String[] args) {
        int[] arr = {45,78,12,43,90,11,42};
        int n = arr.length; //length of arr
        Arrays.sort(arr);//sort the array in asc order, in this case last element will be the largest
        int count=0;//take a counter and initialize it from 0
        int check = 0;//this is a variable that hold the first, second and third largest number
        for(int i=1;i<=n;i++){ // we started the loop from 1
            if(count < 3){ // counter condition unless counter reaches 3 , (0,1,2)
                if(check != arr[n-i]){ //one more condition to check should not equal to last element. look carefully to n-i
                    check = arr[n-i];//last element assigned to check
                    count++;//counter increased by one.
                }
            }else{
                break;
            }
            System.out.println(check+" ");
        }
    }
}
