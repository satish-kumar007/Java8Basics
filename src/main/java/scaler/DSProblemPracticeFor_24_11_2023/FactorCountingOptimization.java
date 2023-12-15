package scaler.DSProblemPracticeFor_24_11_2023;

import java.sql.Time;

public class FactorCountingOptimization {
    public static void main(String[] args) {
        new FactorCountingOptimization().getFactorsOrdinary(9999999999L);
        new FactorCountingOptimization().getFactorsOptimized(9999999999L);
    }

    public int getFactorsOrdinary(Long num){
        //Ordinary approach
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(long i=1L;i<=num;i++){
            if(num%i == 0){
                count++;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println(count+"  Time taken "+(endTime-startTime));
        return count;
    }

    public int getFactorsOptimized(Long num){
        //Optimized approach
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(long i=1L;i*i<=num;i++){
            if(num%i == 0){
                if(i == num/i){
                    count = count+1;
                }else{
                    count = count+2;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(count+"  Time taken "+(endTime-startTime));
        return count;
    }
}
