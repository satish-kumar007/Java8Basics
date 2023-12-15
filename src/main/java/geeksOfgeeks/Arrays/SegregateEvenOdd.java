package geeksOfgeeks.Arrays;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        int[] arr ={7,3,5,6,2,9,1,2,8};
        int n= arr.length;
        int i=-1, j=0;
        while(j != n){  //This condition is important
            if(arr[j] % 2 ==0){ //check for even number
                i++;
                int temp = arr[i];// put 0th element in temp
                arr[i] = arr[j];//store even in oth pos
                arr[j] = temp;//store temp in
            }
            j++;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
