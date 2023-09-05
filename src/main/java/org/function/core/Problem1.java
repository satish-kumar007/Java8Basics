package org.function.core;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int[] x = {12,34,56,87,12,-34,56,2,-3,7,9,1,76,};
        //get all even numbers
        for(int i : x){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
        System.out.println();
        //get all odds
        for(int i : x){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
        System.out.println();
        int max=0;

        //biggest even number
        for(int i : x){
            if(i%2==0 && i < Integer.MAX_VALUE){
                max = i;
            }
        }
        System.out.println(max);
        System.out.println();
        int min = 0;
        //smallest odd number
        for(int i : x){
            if(i%2!=0 && i < Integer.MAX_VALUE){
                min = i;
            }
        }
        System.out.println(min);

        //Unable to get negative number MIN ?????
        //finally resolved
        int min_1 = Arrays.stream(x).filter(i -> i%2!=0).min().getAsInt();
        int max_1 = Arrays.stream(x).filter(i -> i%2 == 0).max().getAsInt();
        System.out.println(min_1);
        System.out.println(max_1);

        System.out.println((max)-(min));

    }
}
