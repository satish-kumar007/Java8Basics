package scaler.problems11102023;

public class ObjectiveQuestion {
    public static void main(String[] args) {
        int[][]mat = {
                {2,6,7,8},
                {3,9,4,1},
                {6,5,0,9}
        };
        int[][]trans = new int[4][3];
        for(int i=0; i < 3;i++) {
            for(int j=0; j < 4;j++) {
                trans[i][j] = mat[j][i];
            }
        }
    }
}
