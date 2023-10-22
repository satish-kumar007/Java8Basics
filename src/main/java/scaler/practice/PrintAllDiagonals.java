package scaler.practice;

public class PrintAllDiagonals {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4,4},
                        {6,4,7,8,6},
                        {2,4,1,7,9},
                        {0,4,7,1,1}};
        int n = arr.length;
        int m = arr[0].length;
        for(int j=0;j<m;j++){
            int r = 0;
            int c = j;
            while(r < n && c>=0){
                System.out.print(arr[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }

        for(int i=0;i<n;i++){
            int r = i;
            int c = m-1;
            while(r < n && c>=0){
                System.out.print(arr[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }
    }
}
