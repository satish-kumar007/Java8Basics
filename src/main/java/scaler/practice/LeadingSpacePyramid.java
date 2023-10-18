package scaler.practice;

public class LeadingSpacePyramid {
    public static void main(String[] args) {
        int num=7;
        for(int i=num;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=num-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
