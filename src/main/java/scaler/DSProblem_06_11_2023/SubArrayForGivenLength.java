package scaler.DSProblem_06_11_2023;

public class SubArrayForGivenLength {
    public static void printSubArray(int []arr,int start,int length){
        int index = start+length;
        int alternative = start+length-1; //this is an alternative
        for(int i=start;i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=start;i<=alternative;i++){ //here loop ends  on i<=
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] x = {3,4,5,6,7,8,1,3,9,3};
        printSubArray(x,2,5);
    }
}
