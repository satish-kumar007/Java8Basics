package scaler.practice;

public class SquareMatrixTranspose {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                        {6,4,7,8},
                        {2,4,1,7},
                        {0,4,7,1}};
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
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
