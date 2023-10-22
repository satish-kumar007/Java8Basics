package scaler.practice;

import java.util.ArrayList;

public class GetUniqueElementsArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,2,3,5,9,0,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int x = arr[i];
            list.add(x);
        }
        for(int i = 0;i<n;i++){
            int element = list.get(i);
            int frequency = 0;
            for(int k=0;k<n;k++){
                if(list.get(k).equals(element)){
                    frequency++;
                }
            }
            if(frequency == 1){
                //add this in to arrlist
            }
        }
    }
}
