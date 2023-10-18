package scaler.problems09102023;

public class ArrayConcept2D {
    public static void main(String[] args) {
        int[][] x = {{1,2,3,4,5},{6,7,1,3,9},{0,7,4,2,6},{1,6,9,3,5}};
        //Print First row only
        int row = 0;
        int colLength = x[0].length;
        for(int i = 0;i<colLength;i++){
            System.out.print(x[row][i]+" ");
        }
        System.out.println();

        //Print First column only
        System.out.println();
        int col = 0;
        int rowLength = x.length;
        for(int i=0;i<rowLength;i++){
            System.out.print(x[i][col]+" ");
        }
        System.out.println();

        //Print all rows
        System.out.println();
        int rowlength = x.length;
        int collength = x[0].length;
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }

        //Print all cols
        System.out.println();
        int rowlen = x.length;
        int collen = x[0].length;
        for(int i=0;i<collen;i++){
            for(int j=0;j<rowlen;j++){
                System.out.print(x[j][i]+" ");
            }
            System.out.println();
        }

        //Print all rows in wave form
        System.out.println();
        int rlen = x.length;
        int clen = x[0].length;
        for(int i=0;i<rlen;i++){
            if(i%2 == 0) {
                for(int j=0;j<clen;j++){
                    System.out.print(x[i][j]+" ");
                }
            }else{
                for(int j=clen-1;j>=0;j--){
                    System.out.print(x[i][j]+" ");
                }
            }
            //System.out.println();
        }

        //Print all columns in wave form
        System.out.println();
        int rlen_1 = x.length;
        int clen_1 = x[0].length;
        for(int c=0;c<clen_1;c++){
            if(c%2 == 0) {
                for(int r=0;r<rlen_1;r++){
                    System.out.print(x[r][c]+" ");
                }
            }else{
                for(int r=rlen_1-1;r>=0;r--){
                    System.out.print(x[r][c]+" ");
                }
           }
            //System.out.println();
        }
    }
}
