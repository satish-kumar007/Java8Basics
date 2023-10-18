package scaler.problems04102023;

import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        int element = sc.nextInt();
        addElement(arr,position,element);
    }
    public static int[] addElement(int[] A, int postition, int element){
        int n = A.length;
        int[] newArr = new int[n+1];
        int index = postition-1;
        for(int i=0;i<index;i++){
            newArr[i] = A[i];
        }
        for(int i=index;i<n;i++){
            newArr[i+1]=A[i];
        }
        newArr[index] = element;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i=0;i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
        return newArr;
    }
}
