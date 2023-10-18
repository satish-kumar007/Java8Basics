package scaler.problems29092023;
/*
You are given T(number of test cases) integer arrays. For each array A, you have to find the value of absolute
difference between the counts of even and odd elements in the array.
 */
import java.util.Scanner;

public class ArrayEvenOddElementsOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            int evenCounter = 0;
            int oddCounter = 0;
            int numOfElements = sc.nextInt();
            int[] arr1 = new int[numOfElements];
            //size of arr
            for(int j =0;j<numOfElements;j++){
                //arr elements
                arr1[j] = sc.nextInt();
                if(arr1[j] % 2 == 0){
                    evenCounter++;
                }else{
                    oddCounter++;
                }
            }
            System.out.println(evenCounter - oddCounter);
        }
    }
}
