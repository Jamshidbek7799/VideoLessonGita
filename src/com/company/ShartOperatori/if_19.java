package com.company.ShartOperatori;

import java.util.Scanner;

public class if_19 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a==b || a==c|| a==d || b==c || b==d || c==d  ){
                if (b==c && c==d ) System.out.println(a);
                if (a==c && c==d ) System.out.println(b);
                if (a==b && b==d ) System.out.println(c);
                if (a==b && b==c ) System.out.println(d);
            }else System.out.println("teng emas so'tak");





        }
    }
}

