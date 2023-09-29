package scaler.problems180923;

public class MCQ {
    public static void main(String[] args) {

        int n = 25364;
        int sum = 0;
        while(n > 0) {
            int ld = n % 10;
            sum += ld;
            System.out.print(ld + " ");
            n = n / 10;
        }
        System.out.print(sum);

        /*int n = 34562;
        int sum = 0;
        while(n > 0) {
            int ld = n % 10;
            sum += 1;
            System.out.print(ld + " ");
            n = n / 10;
        }
        System.out.print(sum);

        for(int i=0;i<10;i++){
            break;
        }
        //System.out.println(i);
*/
        int i = 0;
        for(i = 0; i <10; i++) {
            continue;
        }

            System.out.println(i);


    }

}
