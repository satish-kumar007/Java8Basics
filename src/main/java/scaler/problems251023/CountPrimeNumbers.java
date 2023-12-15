package scaler.problems251023;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        int x = solve(19);
        System.out.println(x);
    }
    public static int solve(int A) {
        int counter;
        int numOfPrimes = 0;
        int i,j = 0;
        for(j=2;j<=A;j++){
            counter=0;
            for(i=1;i<=j;i++){
                if(j % i == 0){
                    counter++;
                }
            }
            if(counter == 2)
                numOfPrimes++;
        }
        return numOfPrimes;
    }
}
