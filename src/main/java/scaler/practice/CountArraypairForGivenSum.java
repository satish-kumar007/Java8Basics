package scaler.practice;

public class CountArraypairForGivenSum {
    public static void main(String[] args) {
        int givenSum = 23;
        int[] arr ={10,1,22,9,14};
        int n = arr.length;
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] + arr[j] == givenSum){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
