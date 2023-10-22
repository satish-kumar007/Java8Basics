package scaler.problems16102023;

import java.util.Scanner;

public class CountVowelsVsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            int vowels = 0;
            String str = sc.next();
            int n = str.length();
            char[] ch = str.toCharArray();
            for(int k=0;k<n;k++){
                if(ch[k]=='a' || ch[k]=='e' ||ch[k]=='i' || ch[k]=='o' || ch[k]=='u'){
                    vowels++;
                }
            }
            int consonants = n-vowels;
            System.out.println(vowels+" "+consonants);
        }
    }
}
