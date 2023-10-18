package scaler.problems29092023;
/*
Given an array A[] and an element B, return the index of element B in array (0 based indexing).
If element is not present in array, return -1.
 */
public class FindPositionOfElementInArray {
    public static void main(String[] args) {
        int []x = {2,4,5,6,7,8,9,0,3,12,34,};
        int elemnet = 12;
        int pos = -1;
        for(int i=0;i<x.length;i++) {
            if (x[i] == elemnet) {
                pos = i;
                 break;
            }
        }
        System.out.println(pos);
        solve("scaler");
    }
    public static String solve(String A) {
        int n = A.length();
        String s = null;
        char[] ch = new char[n];
        for(int i=0;i<n;i++){
            ch[i] = (char)(A.charAt(i) - 32);
        }
        s = String.valueOf(ch);
        System.out.println(s);
        return s;
    }
}
