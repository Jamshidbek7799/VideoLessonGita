package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_34 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ((x>=1 && x<=8) && (y>=1 && y<=8) ){

                boolean bool =  (x%2==0 && y%2==1 || x%2==1 && y%2==0);
                System.out.println(bool==true?"Oq":"Qora");

            }else {
                System.out.println("so'tak 1 dan 8 gacha kirit");
            }


        }
    }
}
