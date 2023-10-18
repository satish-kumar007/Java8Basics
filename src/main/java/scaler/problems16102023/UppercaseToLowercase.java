package scaler.problems16102023;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        String s = "SCALER";
        String l = solve(s);
        System.out.println(l);
    }
    public static String solve(String A) {
        int strLength = A.length();
        String lowercase = null;
        char[] ch = A.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 65 && ch[i] <=90){
                ch[i] = (char)(ch[i]+32);
            }
            lowercase = String.valueOf(ch);
        }
        return lowercase;
    }
}
