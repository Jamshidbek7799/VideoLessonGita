package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean bool = (a==b && b==c && a==c);

        System.out.println(bool);
    }
}
