package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_36 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            if ((x1>=1 && x1<=8) && (y1>=1 && y1<=8) && (x2>=1 && x2<=8) && (y2>=1 && y2<=8) ){
                boolean bool = (x1==x2 || y1==y2);
                System.out.println(bool==true?"o'ta oladi":"Error");
            }else {
                System.out.println("so'tak 1 dan 8 gacha kirit");
            }


        }
    }
}
