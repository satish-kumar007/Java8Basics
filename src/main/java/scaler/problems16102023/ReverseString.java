package scaler.problems16102023;

public class ReverseString {
    public static void main(String[] args) {
        String s = "SCALER";
        System.out.println(s.charAt(1));
        String l = solve(s);
        System.out.println(l);
    }
    public static String solve(String A) {
        int n =A.length();
        char[] ch = A.toCharArray();
        String reverse = null;
        int s = 0;
        int e = n - 1;
        while(s < e ){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        reverse = String.valueOf(ch);
        return reverse;
    }
}
