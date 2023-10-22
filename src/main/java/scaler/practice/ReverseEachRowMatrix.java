package scaler.practice;

public class ReverseEachRowMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5},
                        {6,4,7,8,9},
                        {2,4,1,7,9},
                        {0,4,7,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            int s = 0;
            int e= m-1;
            while(s<e){
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }

        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
