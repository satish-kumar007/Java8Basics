package scaler.problems25092023;

public class HalfPyramidSkipEven {
    public static void main(String[] args) {
         int num  =5;
//         for(int i = 1;i<=5;i++){
//             //int val = 1;
//             for(int j = 1;j<=i;j++){
//                 if(j%2 == 0){
//                     System.out.print(" ");
//                 }else{
//                     System.out.print(j);
//                 }
//                 //val++;
//             }
//             System.out.println();
//         }

        //int i=0,j=0;
        for(int i=1;i<=num;i++){
            int val = 1;
            for(int j=1;j<=i;j++){
                if(j % 2 == 0){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
