package com.company.Video;

import java.util.Scanner;

public class MatematikFunksiyalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double c = sc.nextDouble();

        System.out.println( Math.pow(a, b)+ " // darajaga ko'tarish");
        System.out.println( Math.sqrt(a)+" // ildizdan chiqarish");
        System.out.println( Math.max(a, b)+ " // maximal sonni topish");
        System.out.println( Math.min(a, b)+ " // minimal sonni topish");
        System.out.println( Math.log(c)+ " // logarifm topish");
        System.out.println( Math.exp(c)+ " // e asosga ko'ra expendet topish");
        System.out.println( Math.PI + " // PI soni");
    }
}
