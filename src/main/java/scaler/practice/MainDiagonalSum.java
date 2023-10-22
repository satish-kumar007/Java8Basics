package scaler.practice;

public class MainDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                {6,4,7,8},
                {2,4,1,7},
                {0,4,7,1}};
        int n = arr.length;
        int m = arr[0].length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i][i];
        }
        System.out.println(sum);
    }
}
