package scaler.problems09102023;

public class ObjectiveQuestions {
    public static void main(String[] args) {
        int[][] x = {{1, 2, 1, 2}, {2, 3, 4, 5}, {6, 7, 6, 6}, {6, 7, 6, 6}};
        System.out.println(x[0].length + "   " + x[1].length + "   " + x[2].length);
        for (int i = 0; i < 4; i++)
            System.out.print(x[i][1] + " ");


    int[][] arr = {{3, 2, 1}, {1, 2, 3}};
    for(int row = 1; row < arr.length; row++) {
        for(int col = 1; col < arr[0].length; col++) {
            if(arr[row][col] % 2 == 1) {
                arr[row][col] = arr[row][col] + 1;
            }
            if(arr[row][col] % 2 == 0) {
                arr[row][col] = arr[row][col] * 2;
            }
        }
    }
    for(int i = 0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+"  ");
        }
    }
    }

}
