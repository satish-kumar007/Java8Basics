package scaler.DSProblem_20_11_2023;

public class ReverseString {
    public static void main(String[] args) {
        String s[] = "you shall     not pass".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i]+" ";
        }
        ans = ans.replaceAll("\\s+"," ").trim();
        System.out.println("Reversed String: " + ans);
    }

    public String solve(String A) {
        String s[] = A.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i]+" ";
        }
        ans = ans.replaceAll("\\s+"," ").trim();
        return ans;
    }
}
