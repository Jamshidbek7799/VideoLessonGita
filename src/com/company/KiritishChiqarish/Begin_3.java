package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int S = a*b;
        int P = 2*(a+b);
        System.out.println("S= "+ S +"\nP= "+P);
    }
}
