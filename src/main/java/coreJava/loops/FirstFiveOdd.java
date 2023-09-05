package coreJava.loops;

public class FirstFiveOdd {
    public static void main(String[] args) {
        int x = 10;
        for(int i=1;i<x;i++){
            if(i%2==1){
                System.out.print(i);
                if(i<9){
                    System.out.print(" ");
                }
            }
        }

        for(int i=0;i<x;i++){
            if(i%2==0){
                System.out.print(i);
                if(i<9){
                    System.out.print(" ");
                }
            }
        }
    }
}
