package scaler.problems22092023;

public class PercentageFunction {
    public static void main(String[] args) {
        System.out.println(solve(291,664));
    }
    public static int solve(int A, int B) {
        float marksObtained = A;
        float totalMarks = B;
        float percentage = (marksObtained/totalMarks)*100.00F;
        System.out.println(percentage);
        return (int)Math.ceil(percentage);
    }
}
