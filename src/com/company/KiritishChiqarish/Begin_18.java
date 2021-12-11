package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double AC = a+c;
        double BC = b+c;
        double Kopaytma = AC*BC;
        System.out.println("AC= "+AC+"\nBC= "+BC+"\nKo'paytma= "+Kopaytma);

    }
}
