package scaler.practice;

public class PrintMatrixColumnsInWaveForm {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5},
                        {6,4,7,8,9},
                        {2,4,1,7,9},
                        {0,4,7,1,1}};
        int n = arr.length;
        int m = arr[0].length;

        for(int c=0;c<m;c++){
            if(c%2==0){
                for(int r=0;r<n;r++){
                    System.out.print(arr[r][c]+" ");
                }
            }else{
                for(int r=n-1;r>=0;r--){
                    System.out.print(arr[r][c]+" ");
                }
            }
        }
    }
}
