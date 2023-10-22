package scaler.practice;

public class PrintMatrixRowsInWaveForm {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,5},
                        {6,4,7,8,9},
                        {2,4,1,7,9},
                        {0,4,7,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        for(int r=0;r<n;r++){
            if(r%2==0){
                for(int c=0;c<m;c++){
                    System.out.print(arr[r][c]+" ");
                }
            }else{
                for(int c=m-1;c>=0;c--){
                    System.out.print(arr[r][c]+" ");
                }
            }

            //System.out.println();
        }
    }
}
