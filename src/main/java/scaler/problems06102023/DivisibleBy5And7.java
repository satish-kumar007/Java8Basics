package scaler.problems06102023;

import java.util.ArrayList;

public class DivisibleBy5And7 {
    public static void main(String[] args) {
        int[] x = {23, 34, 25, 35, 66, 70, 14};
        solve(x);
    }
    public static int[] solve(int[] arr) {
        // Complete function template here

        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%5==0 && arr[i]%7==0){
                list.add(arr[i]);
            }
        }
        int[] resultArr = new int[list.size()];
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }
}
