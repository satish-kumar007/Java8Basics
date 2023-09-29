package scaler.problems25092023;

public class HowManyChocolates {
    public static void main(String[] args) {
        System.out.println(howManyChoco(10,2,2));
    }
    public static int howManyChoco(int A, int B, int C){
        int numOfChoco = A/B;
        if(numOfChoco > C){
            return C;
        }else{
            return numOfChoco;
        }
    }
}
