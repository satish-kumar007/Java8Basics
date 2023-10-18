package scaler.problems04102023;

public class ConsecutiveDuplicateInArray {
    public static void main(String[] args) {
        int[] x = {1,2,4,3};
        boolean b = solve(x);
        System.out.println(b);
    }
    public static boolean solve(int arr[]) {
        // Complete the function here
        boolean result = false;
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                result = true;
            }
        }
        return result;
    }
}
