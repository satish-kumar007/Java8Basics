package scaler.DSProblem_27_11_2023;

public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] x = {1,2};
        int z = trap(x);
    }

    public static int trap(final int[] A) {
        int n = A.length;
        int l = 0;
        int r = n-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(l<r){
            lmax = Math.max(lmax, A[l]);
            rmax = Math.max(rmax, A[r]);
            if(lmax<rmax){
                ans = ans + (lmax-A[l]);
                l++;
            }else{
                ans = ans + (rmax-A[r]);
                r--;
            }
        }
        System.out.println(ans);
        return ans;
    }

    public int trap_1(final int[] A) {
        int n = A.length;
        int left = 0;
        int right = n - 1;
        int res = 0;
        int maxleft = 0, maxright = 0;
        while(left <= right){
            // When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
            if(A[left] <= A[right]){
                if(A[left] >= maxleft)
                    maxleft = A[left]; //This index wont store any water as there is no index towards the left whose height is greater than this.
                else
                    res += maxleft - A[left];
                left++;
            }
            else{
                if(A[right] >= maxright)
                    maxright = A[right]; //This index wont store any water as there is no index towards the right whose height is greater than this.
                else
                    res += maxright - A[right];
                right--;
            }
        }
        return res;
    }
}
