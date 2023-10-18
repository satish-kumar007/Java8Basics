package scaler.problems29092023;

/*Write a program that returns the product of all elements present in the array.

 */
public class ProductOfArrElements {
    public static void main(String[] args) {
        int[] x = {7,9,2,51};
        solve(x);
    }
    public static long solve(int[] arr) {
        long product=1L;
        for(int i=0;i<arr.length;i++){
            product = product * arr[i];
        }
        System.out.println(product);
        return product;
    }
}
