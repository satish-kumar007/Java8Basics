package scaler.problems180923;

import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for(i=1;i<=num;i++){
            int moreNum = sc.nextInt();
            int sum = 0;
            int j = 1;
            while(j <= moreNum/2){
                if(moreNum % j == 0){
                    sum = sum+j;
                }
                j++;
            }
            if(moreNum == sum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
