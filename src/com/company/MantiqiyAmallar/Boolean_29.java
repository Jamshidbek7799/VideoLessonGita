package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1 = sc.nextInt();
        int x = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y = sc.nextInt();
        int y2 = sc.nextInt();

        boolean bool = ((x1<x && x<x2) && (y1<y && y<y2));

        System.out.println(bool);
    }
}
