package scaler.problems11102023;

import java.util.ArrayList;

public class IdentityMatrix2DArr {
    public int solve(final int[][] A) {
        int ans=1;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i == j && A[i][j] != 1)
                    ans = 0;
                else if (i != j && A[i][j] != 0)
                    ans = 0;
            }
        }
        return ans;
    }
}
