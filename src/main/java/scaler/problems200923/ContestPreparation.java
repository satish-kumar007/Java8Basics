package scaler.problems200923;

public class ContestPreparation {
    public static void main(String[] args) {

        //Print reverse staircase pattern
        /*
        ******
        *****
        ****
        ***
        **
        *
         */
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Print reverse staircase pattern --ends
        System.out.println("==========================================");
        //Print reverse staircase pattern for numbers
        int x=5;
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Print reverse staircase pattern for numbers -- ends
        System.out.println("==========================================");

        //Leading space pyramid pattern for *
        int y=5;
        for(int i=1;i<=y;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=y-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Print reverse staircase pattern for numbers -- ends

    }
}
