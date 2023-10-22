package scaler.problems16102023;

public class DiverseCharactersProgram {
    public static void main(String[] args) {
        solve("Hel235671er1");
    }
    public static int solve(final String A) {
        int ans = 0;
        int n = A.length();
        char[] ch = A.toCharArray();
        int counter = 0;
        for(int i = 0;i<n;i++){
            if(ch[i] >= 65 && ch[i] <=90 || ch[i] >=97 && ch[i] <=122){
                counter++;
            }
        }
        int cal = n-counter;
        if(counter > cal){
            ans = counter;
        }else{
            ans = cal;
        }
        System.out.println(ans);
        return ans;
    }
}
