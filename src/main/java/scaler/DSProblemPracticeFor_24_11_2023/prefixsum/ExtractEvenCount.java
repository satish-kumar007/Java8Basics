package scaler.DSProblemPracticeFor_24_11_2023.prefixsum;

public class ExtractEvenCount {
    public static void main(String[] args) {
        int[] x ={3,5,8,9,16,14,13,12};
        int [][]range = {{1,5},{2,6},{4,5},{4,4}};
        getPrefixCount(x);
        System.out.println();
        getEvenCount(x,range);
    }
    public static int getEvenCount(int[] arr, int[][] range){
        int n = range.length;
        int count = 0;
        int[] pc = getPrefixCount(arr);
        for(int i = 0;i<n;i++){
            int start = range[i][0];
            int end = range[i][1];
            if(start != 0){
                count = pc[end] - pc[start-1];
            }else{
                count = pc[end];
            }
            System.out.print(count+" ");
        }
        return count;
    }
    public static int[] getPrefixCount(int[] arr){
        int n = arr.length;
        int prefixCount[] = new int[n];
        if(arr[0]%2 == 0){
            prefixCount[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(arr[i]%2 == 0){
                prefixCount[i] = prefixCount[i-1]+1;
            }else{
                prefixCount[i] = prefixCount[i-1];
            }
        }
        for(Integer i : prefixCount){
            System.out.print(i+" ");
        }
        System.out.println();
        return prefixCount;
     }
}
