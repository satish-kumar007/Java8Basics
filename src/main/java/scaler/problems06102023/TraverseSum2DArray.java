package scaler.problems06102023;

public class TraverseSum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{6,7,9},{1,8,0}};

        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
                sum = sum + arr[i][j];

            }
            System.out.print(" "+sum);
            System.out.println();
        }
    }
}
