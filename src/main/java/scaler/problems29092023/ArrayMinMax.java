package scaler.problems29092023;
/*
Take input an array A of size N and write a program to print maximum and minimum elements
of the input. The only line of the input would contain a single integer N that represents the
length of the array followed by the N elements of the input array A.
 */
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        getMinMax();
    }

    public static void getMinMax(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum = 0;
        int min = Integer.MAX_VALUE;//it must be to provide
        int max = Integer.MIN_VALUE;//it must be to provide
        for(int i=0;i<num;i++) {
            arr[i] = sc.nextInt(); // put elements in the array
            if(arr[i] > max){ // to check max element
                max = arr[i];
            }
            if(arr[i] < min){ //to check min element
                min = arr[i];
            }
        }
        System.out.println(max+" "+min);
    }
}
