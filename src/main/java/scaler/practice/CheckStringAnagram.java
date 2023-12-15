package scaler.practice;

import java.util.Arrays;
import java.util.Collections;

public class CheckStringAnagram {
    public static void main(String[] args) {
        boolean b = isAnagram("bd","bd");
        System.out.println(b);
    }

    public static boolean isAnagram(String a,String b){
        boolean ans = false;
        char[] ch = a.toCharArray();
        char[] ch_1 = b.toCharArray();
        if(a.length() != b.length()){
            ans = false;
        }else if(a.length() == 1 && b.length() ==1){
            if(ch[0] == ch_1[0]){
                ans = true;
            }
        }else{
            Arrays.sort(ch);
            Arrays.sort(ch_1);
            ans = Arrays.equals(ch,ch_1);
            if(ans == true){
                ans = true;
            }else{
                ans = false;
            }
        }
        return ans;
    }
}
