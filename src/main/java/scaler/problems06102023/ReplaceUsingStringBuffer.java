package scaler.problems06102023;

public class ReplaceUsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HelloHiHelloHelloHiHelloHelloHiHelloHelloHiHelloHelloHiHello");
        //Replace H with $
        System.out.println(sb.length());
        for(int i =1;i<sb.length();i++){
            if(sb.charAt(i) == 'H'){
                sb.replace(i,i+1,"$");
            }
        }
        System.out.println(sb.toString());
    }
}
