package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int d= (b*b)-5*a*c;

        boolean bool = (d>=0);

        System.out.println(bool);
    }
}
