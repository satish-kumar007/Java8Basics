package scaler.problems13102023;

import java.util.ArrayList;

public class MinDiagonal2DList {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(5);list_1.add(15);list_1.add(50);list_1.add(58);

        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(11);list_2.add(14);list_2.add(51);list_2.add(6);

        ArrayList<Integer> list_3 = new ArrayList<>();
        list_3.add(1);list_3.add(14);list_3.add(5);list_3.add(68);

        ArrayList<Integer> list_4 = new ArrayList<>();
        list_4.add(7);list_4.add(17);list_4.add(65);list_4.add(8);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(list_1);matrix.add(list_2);matrix.add(list_3);matrix.add(list_4);


        ArrayList<Integer> ans = new ArrayList<>();
        int n = matrix.size();
        int m = matrix.get(0).size();

        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(i + j == n-1){
                    ans.add(matrix.get(i).get(j));
                }
            }
        }
        System.out.println(ans);
    }
}
