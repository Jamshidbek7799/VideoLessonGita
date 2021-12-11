package com.company.ShartOperatori;

import java.util.Scanner;

public class if_18 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a==b || b==c || a==c ){
                if (b==c) System.out.println(a);
                if (a==c) System.out.println(b);
                if (a==b) System.out.println(c);
            }else System.out.println("teng emas so'tak");





        }
    }
}

