package scaler.DSProblem_20_11_2023;

public class ToggleString {
    public static String solve(String A) {
        String ans = null;
        char[] ch = A.toCharArray();
        for(int i=0;i< ch.length;i++){
            if(ch[i]>=65 && ch[i]<=90){
                ch[i] = (char)(ch[i]+32);
            }else if(ch[i]>=97 && ch[i]<=122){
                ch[i] = (char)(ch[i]-32);
            }
        }
        ans = String.valueOf(ch);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("Hello"));
    }
}
