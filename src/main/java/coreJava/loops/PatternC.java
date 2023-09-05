package coreJava.loops;
public class PatternC {
    public static void main(String[] args) {
        int n=6;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int k=0;k<n;k++){
            System.out.print("*");
        }
        System.out.println();
        int num=0;
        int num1=0;
        int result = num++ + ++num;
        //num++ = num = num+1
        System.out.println(result);
        System.out.println(num++);
        System.out.println(num1++);
        System.out.println(num++);
        System.out.println(num1++);
        System.out.println(num++);
        System.out.println(num1++);
        System.out.println();
        int num2=0;
        System.out.println(++num2);
        System.out.println(++num2);
    }
}
