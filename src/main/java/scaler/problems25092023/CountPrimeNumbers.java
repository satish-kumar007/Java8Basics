package scaler.problems25092023;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(solve(0));
    }

    public static int solve(int A) {
        int counter;
        int primeCounter = 0;
        for(int i=1;i<=A;i++){
            counter = 0;
            int count = i;
            for(int j=1;j<=i;j++){
                if(count % j == 0){
                    counter++;
                }
            }
            if(counter == 2){
                primeCounter++;
            }
        }
        return primeCounter;
    }
}
