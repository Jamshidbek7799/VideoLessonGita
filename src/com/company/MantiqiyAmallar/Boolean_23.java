package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();

        int yuzlik = A/100;
        int onlik = A%100/10;
        int birlik = A%10;

        boolean bool = (yuzlik == birlik);

        System.out.println(bool);
    }
}