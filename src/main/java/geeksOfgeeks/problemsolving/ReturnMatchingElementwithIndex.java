package geeksOfgeeks.problemsolving;

import java.util.ArrayList;

public class ReturnMatchingElementwithIndex {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int index = i+1;
            if(arr[i] == index){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        int []x = {1};
        valueEqualToIndex(x,1);

    }
}
