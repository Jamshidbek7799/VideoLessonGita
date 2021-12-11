package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        int a = (int) (Math.pow(y2-y1, 2));
        int b = (int) (Math.pow(x2-x1, 2));
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        System.out.println("P= "+2*(a+b));
        System.out.println("S= "+a*b);

    }
}
