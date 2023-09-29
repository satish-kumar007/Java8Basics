package scaler.problems25092023;

public class CheckForPerfectSquare {
    public static void main(String[] args) {
        CheckForPerfectSquare check = new CheckForPerfectSquare();
        check.chechPerfactSquare(10);
        //Math.PI *  Math.pow(r,r);
    }
    public boolean chechPerfactSquare(int num){
        boolean ans = false;
        int i=1;
        while(i*i < num){
            if(i*i == num){
                ans = true;
            }else{
                ans = false;
            }
            i++;
        }
        return ans;
    }

    public int sumOfFactor(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                sum = sum+i;
            }
        }
        return sum;
    }

    public int sumAllEven(int A){
        int sum = 0;
        for(int i= 2;i<=A;i+=2){
            sum+=i;
        }
        return sum;
    }
}
