package scaler.problems04102023;

import java.util.Scanner;

/*
Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.
 */
public class RemoveArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int position = sc.nextInt();
        removeElement(arr,position);
    }
    public static int[] removeElement(int[] A, int postition){
        int n = A.length;
        int[] newArr = new int[n-1];
        int index = postition-1;
        for(int i=0;i<index;i++){
            newArr[i] = A[i];
        }
        for(int i=postition;i<n;i++){
            newArr[i-1]=A[i];
        }
        //newArr[index] = element;
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
