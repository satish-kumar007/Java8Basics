package scaler.problems22092023;

public class TimeToEndCorona {
    public static void main(String[] args) {
        int A=5,B=3,C=1;
        int day=0;
        while(C > 0){
            int newCases = C + B;
            C = newCases - A;
            day++;
        }
    }
}
