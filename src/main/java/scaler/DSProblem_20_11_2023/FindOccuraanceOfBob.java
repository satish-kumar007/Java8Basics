package scaler.DSProblem_20_11_2023;

import practice.java8.predicateinterface.Main;

public class FindOccuraanceOfBob {
    public static void main(String[] args) {
        String bob = "bob";
        char[] ch = bob.toCharArray();
        String bobob = "bobob";
        char[] ch1= bobob.toCharArray();
        int count=2;
        for(int i=ch.length-1;i>=0;i--){
            if(ch1[i] == ch[i] && ch1[i-1] == ch[i-1] && ch1[i-2] == ch[i-2]){
                count++;
            }
        }
        System.out.println(count);

    }
}
