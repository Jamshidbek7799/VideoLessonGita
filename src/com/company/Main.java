package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// kVADRAT TENGLAMA
        Scanner sc = new Scanner(System.in);

        System.out.println("a son: ");
        int a = sc.nextInt();
        System.out.println("b son: ");
        int b = sc.nextInt();
        System.out.println("c son: ");
        int c = sc.nextInt();

        int D = b*b - 4*a*c;
        System.out.println("D = "+D);

        int x1 = (int) ((-b-Math.sqrt(D))/(2*a));
        System.out.println("X1 = "+x1);

        int x2 = (int) ((-b+Math.sqrt(D))/(2*a));
        System.out.println("X2 = "+x2);
    }
}
