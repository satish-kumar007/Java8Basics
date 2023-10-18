package scaler.problems16102023;

public class ReplacingCharacter {
    public static void main(String[] args) {
        change_char("grogramming");
    }
    public static String change_char(String s) {
        // complete the function template
        int n = s.length();
        char first = s.charAt(0);
        StringBuilder sb = new StringBuilder(s);
        for(int i=1;i<n;i++){
            if(sb.charAt(i) == first){
                sb.setCharAt(i,'$');
            }
        }
        return sb.toString();
    }
}
