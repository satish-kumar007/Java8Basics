package scaler.practice;

public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5},
                        {6,4,7,8,9},
                        {2,4,1,7,9},
                        {0,4,7,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        int[][] ans = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j][i] = arr[i][j];
            }
        }
        for(int k=0;k<ans.length;k++){
            for(int x=0;x<ans[0].length;x++){
                System.out.print(ans[k][x]+" ");
            }
            System.out.println();
        }
    }
}
