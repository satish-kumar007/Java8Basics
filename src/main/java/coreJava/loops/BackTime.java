package coreJava.loops;
public class BackTime {
    static int minutes = 40;
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        result(10);

    }
    public static int result(int x){
        int y = minutes - x;
        System.out.println(y);
        return y;
    }
}
