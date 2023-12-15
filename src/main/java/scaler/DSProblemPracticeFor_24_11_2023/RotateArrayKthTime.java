package scaler.DSProblemPracticeFor_24_11_2023;

public class RotateArrayKthTime {
    //Step 1: Reverse the entire array. [0 ...... n-1]
    //Step 2: Reverse the elements till Kth [0 ....... K-1]
    //Step 3: Reverse the elements from K to last [k ...... n-1]
    //Note: to calculate the K value we need to get modulus: K = K%n
    public static int[] rotateKthTime(int[] arr, int k){
        arr = reverseEntire(arr);
        int n = arr.length;
        k = k%n;
        arr = reverseArr(arr,0,k-1);
        arr = reverseArr(arr,k,n-1);

        return arr;
    }
    public static int[] reverseArr(int[] arr, int s, int e){
        int n = arr.length;
        int p1=s;
        int p2 = e;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

    public static int[] reverseEntire(int[] arr){
        int n = arr.length;
        int p1=0;
        int p2 = n-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,9};
        int[] ans = rotateKthTime(x,3);
        for(Integer in : ans){
            System.out.print(in+" ");
        }
    }
}
