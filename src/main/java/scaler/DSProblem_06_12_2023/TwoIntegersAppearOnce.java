package scaler.DSProblem_06_12_2023;

public class TwoIntegersAppearOnce {

    public static void main(String[] args) {
        int[] A ={1, 2};
        solve(A);
    }
    public static int[] solve(int[] A) {
        int n = A.length;
        int xorElement = 0;
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            xorElement = xorElement^A[i];
        }
        int index = -1;
        for(int i=0;i<32;i++){
            if((xorElement & (1 << i)) > 0){
                index = i;
                break;
            }
        }
        int set=0, unset=0;
        for(int i=0;i<n;i++){
            int element = A[i];
            if((element & (1 <<index)) > 0){
                set = set ^ element;
            }else{
                unset = unset^element;
            }
        }
        ans[1] = set;
        ans[0] = unset;
        System.out.println(set+"   :: "+unset);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
        return ans;
    }
}
