package coreJava.loops;

import java.util.Scanner;

public class PacMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int powerPellet = sc.nextInt();
        int ghostTouch = sc.nextInt();
        if(powerPellet == 1)
            if(ghostTouch == 1)
                System.out.println(0);
            else if(ghostTouch == 0)
                System.out.println(0);
            else
                System.out.println();
        else if(powerPellet == 0)
            if(ghostTouch == 1)
                System.out.println(1);
            else
                System.out.println(0);
        else
            System.out.println();
    }
}
