package com.company.ShartOperatori;

import java.util.Scanner;

public class if_8 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a!=b){
                System.out.println("Katta son: "+Math.max(a, b) + "\nKichik son: " + (Math.min(a, b)));
            }else System.out.println("Sonlar TENG: "+a);



        }
    }
}
