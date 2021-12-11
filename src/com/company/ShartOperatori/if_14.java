package com.company.ShartOperatori;

import java.util.Scanner;

public class if_14 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a != b && b != c && a != c) {
                if (true) {

                    if ((c > b && b > a || b > c && c > a))
                        System.out.println(a);  // kichik

                    if ((c > a && a > b || a > c && c > b))
                        System.out.println(b); // kichik

                    if ((a > b && b > c || b > a && a > c))
                        System.out.println(c);  // kichik


                    if ((a > b && b > c || a > c && c > b))
                        System.out.println(a);  // katta

                    if ((b > c && c > a || b > a && a > c))
                        System.out.println(b);

                    if ((c > a && a > b || c > b && b > a))
                        System.out.println(c);
                }
            } else
                System.out.println("O'zaro teng");


        }
    }
}

