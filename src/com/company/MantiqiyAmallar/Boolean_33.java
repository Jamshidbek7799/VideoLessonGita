package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean bool1 = (A+B>C);
        boolean bool2 = (A+C>B);
        boolean bool3 = (C+B>A);

        boolean bool = bool1 && bool2 && bool3;

        System.out.println(bool);

    }
}
