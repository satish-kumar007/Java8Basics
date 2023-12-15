package scaler.DSProblem_06_12_2023;

public class SingleNumberOccuranceCaseThrice {
    public static void main(String[] args) {
        int[] A={1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        singleNumber(A);
    }
    public static int singleNumber(final int[] A) {
        int n = A.length;
        int ans = 0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if((A[j] & (1 << i)) > 0){
                    count++;
                }
            }
            if(count % 3 ==1){
                ans = ans | (1<<i);
            }
        }
        System.out.println(ans);
        return ans;
    }
}
