package coreJava.loops;

import java.util.Scanner;

public class AlbumRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soldAlbum = sc.nextInt();
        String rating = "None";
        if(soldAlbum > 10000000){
            rating = "diamond";
            System.out.println(rating);
        }else if(soldAlbum > 1000000){
            rating = "platinum";
            System.out.println(rating);
        }else if(soldAlbum > 100000){
            rating = "gold";
            System.out.println(rating);
        }else{
            System.out.println(rating);
        }
    }
}
