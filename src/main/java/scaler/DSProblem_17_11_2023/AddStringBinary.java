package scaler.DSProblem_17_11_2023;

public class AddStringBinary {

    public static String addBinary(String A, String B) {
        int i = A.length() - 1, j = B.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += A.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += B.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                result.append(sum);
                carry = 0;
            }
            else if (sum == 2) {
                result.append("0");
                carry = 1;
            }
            else {
                result.append("1");
                carry = 1;
            }
            i--;
            j--;
        }
        if (carry == 1) {
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("10100010101010101010101010101001011001110","101111000100100100111110010010101110101001100100101001111010011000000110"));
    }
}
