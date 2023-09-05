package coreJava.loops;

public class PatternDiamond {
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==4/2 || j==4/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                //System.out.println();
            }
        }
    }
}
