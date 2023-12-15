package scaler.DSProblem_03_11_2023;

public class CarryForwardPaierCount {
    public static void main(String[] args) {
        long x = solve("ABCGAG");
        System.out.println(x);
    }
    public static long solve(String A) {
        int n = A.length();
        char[] ch = A.toCharArray();
        long countG = 0;
        long pair = 0;
        for(int i=n-1;i>=0;i--){
            if(ch[i] == 'G'){
                countG++;
            }else if(ch[i] == 'A'){
                pair = pair+countG;
            }
        }
        return pair;
    }
}
