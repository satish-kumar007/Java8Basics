package scaler.practice;

public class ReverseString {

    static int isPalindrome(String S) {
        // code here
        int n = S.length();
        char[] ch = S.toCharArray();
        String original = S;
        StringBuilder sb = new StringBuilder(S);
        String reverse = sb.reverse().toString();
        System.out.println(S);
        System.out.println(reverse);
        return 0;
    }

    public static void main(String[] args) {
        isPalindrome("abbaa");
    }
}
