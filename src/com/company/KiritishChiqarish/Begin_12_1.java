package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = Math.sqrt(a*a + b*b);
        double P = a+b+c;

        System.out.println("Gipotenuza : "+ c);
        System.out.println("Perimetr : "+ P );
    }
}
