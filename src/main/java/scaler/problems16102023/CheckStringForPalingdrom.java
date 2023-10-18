package scaler.problems16102023;

import java.util.Scanner;

public class CheckStringForPalingdrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = null;
        for(int i=1;i<=num;i++){
            str = sc.next();
            boolean b = isPalin(str);
            System.out.println(b);
        }
    }
    public static boolean isPalin(String s) {
        boolean ans = false;
        int n = s.length();
        char[] ch = s.toCharArray();
        int startI = 0;
        int endI = n-1;
        while(startI < endI){
            char temp = ch[startI];
            ch[startI] = ch[endI];
            ch[endI] = temp;
            startI++;
            endI--;
        }
        String reverse = String.valueOf(ch);
        System.out.println(reverse);
        if(s.equals(reverse)){
            ans = true;
        }
        return ans;
    }
}
