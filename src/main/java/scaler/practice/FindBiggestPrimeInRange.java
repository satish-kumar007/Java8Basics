package scaler.practice;

public class FindBiggestPrimeInRange {
    public static void main(String[] args) {
        int start = 27;
        int end = 45;
        int prime = -1;

        int j=0;
        for(j=start;j<=end;j++){
            int counter=0;
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    counter++;
                }
            }
            if(counter == 2){
                prime = j;
            }
        }
        System.out.println(prime);
    }
}
