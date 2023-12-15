package scaler.DSProblem_20_11_2023;

public class CheckForAlhanumericArray {
    public static void main(String[] args) {
        char[] x ={'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        char[] y ={'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};

        int z = solve(y);
        System.out.println(z);
    }
    public static int solve(char[] A) {
        int n = A.length;
        int ans = 1;
        for(int i=0;i<n;i++){
            if(!(A[i] >= 48 && A[i] <=57) && !(A[i] >= 65 && A[i] <=90) && !(A[i] >= 97 && A[i] <=122)){
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
