package scaler.problems22092023;

public class RoundedValue {
    public static void main(String[] args) {
        solve(-771);
    }

    public static int solve(int A) {
        float roundedValue = 0.0F;
        double aNum = A;
        double numA = aNum/200.00F;
        System.out.println(numA);
        if(numA >= 0){
            numA = numA + 0.5F;
            roundedValue = (float)Math.floor(numA);
        }else{
            System.out.println(numA);
            numA = numA - 0.5F;
            System.out.println(numA);
            roundedValue = (int)Math.ceil(numA);
            System.out.println(numA+ "    "+roundedValue+"  "+Math.ceil(numA));
        }
        return (int)roundedValue;
    }
}
