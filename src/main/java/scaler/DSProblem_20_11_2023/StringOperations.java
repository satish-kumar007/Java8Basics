package scaler.DSProblem_20_11_2023;

public class StringOperations {
    public static String solve(String A) {
        String concat = A.concat(A);
        char[] ch = concat.toCharArray();
        String ans=null;
        StringBuilder sb = new StringBuilder(concat);
        System.out.println(ch.length);
        for(int i=ch.length-1;i >=0;i--){
            if(ch[i]>=65 && ch[i]<=90){
                sb.deleteCharAt(i);
            }
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
                sb.setCharAt(i,'#');
            }
        }
        ans = sb.toString();
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("aeiOUz"));
    }
}
