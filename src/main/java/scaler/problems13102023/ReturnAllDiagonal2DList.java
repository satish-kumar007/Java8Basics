package scaler.problems13102023;

import java.util.ArrayList;

public class ReturnAllDiagonal2DList {
    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(5);list_1.add(15);list_1.add(50);list_1.add(58);list_1.add(25);

        ArrayList<Integer> list_2 = new ArrayList<>();
        list_2.add(11);list_2.add(14);list_2.add(51);list_2.add(6);list_2.add(9);

        ArrayList<Integer> list_3 = new ArrayList<>();
        list_3.add(1);list_3.add(14);list_3.add(5);list_3.add(68);list_3.add(95);

        ArrayList<Integer> list_4 = new ArrayList<>();
        list_4.add(7);list_4.add(17);list_4.add(65);list_4.add(8);list_4.add(4);

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(list_1);matrix.add(list_2);matrix.add(list_3);matrix.add(list_4);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int n = matrix.size();
        int m = matrix.get(0).size();
        for(int j=0;j<m;j++){
            ArrayList<Integer> list = new ArrayList<>();
            int r =0;
            int c = j;
            while(r<n && c>=0){
                list.add(matrix.get(r).get(c));
                r++;
                c--;
            }
            ans.add(list);
        }

        for(int i=1;i<n;i++){
            ArrayList<Integer> arr = new ArrayList<>();
            int r=i;
            int c = m-1;
            while(r<n && c>=0){
                arr.add(matrix.get(r).get(c));
                r++;
                c--;
            }
            ans.add(arr);
        }
        System.out.println(ans);
    }

}
