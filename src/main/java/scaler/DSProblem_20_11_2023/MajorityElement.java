package scaler.DSProblem_20_11_2023;

public class MajorityElement {
    public static void main(String[] args) {
        int []x = {2,1,2};
        System.out.println(majorityElement(x));
    }
    public static int majorityElement(final int[] A) {
        int maj = A[0], count=1;
        int n = A.length;
        for (int i=1;i<n;i++){
            if(count==0){
                maj = A[i];
                count = 1;
            }else if(A[i] == maj){
                count++;
            }else{
                count--;
            }
        }
        int freq = 0;
        for(int i=0;i<n;i++){
            if(A[i] == maj){
                freq++;
            }
        }
        if(freq == n/2){
            return maj;
        }
        return 1;
    }
}
