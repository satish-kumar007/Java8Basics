package scaler.problems04102023;

public class FoundUniqueElementInArray {
    public static void main(String[] args) {
        int[] x = {1, 4, 3, 5, 2, 3, 5, 1, 4};
        solve(x);
        int y[] = {9, 10, 7, 10, 9, 1, 5, 1, 5};
        solve(y);
    }
    public static int solve(int[] A) {
        int uniqueElement = 0;
        for(int i=0;i<A.length;i++){
            int frequency = 0;
            int element = A[i];
            for(int j=0;j<A.length;j++){
                if(element == A[j]){
                    frequency++;
                }
            }
            if(frequency == 1){
                uniqueElement = element;
            }
        }
        System.out.println(uniqueElement);
        return uniqueElement;
    }
}
