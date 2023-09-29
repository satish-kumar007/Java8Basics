package coreJava.loops;

public class GetLastDigitOfNum {
    public static void main(String[] args) {
        int x = 234569;
        int lastDigit = x%10;
        System.out.println(lastDigit);
        int counter = 0;
        //count digits in a number
        while(x != 0){
            x = x/10;
            counter++;
        }
        System.out.println(counter);

        //second way
        int digits = (int)(Math.floor(Math.log10(78987898L)+1));
        System.out.println(digits);
    }
}
