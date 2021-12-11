package com.company.KiritishChiqarish;
import java.util.Scanner;

public class Begin_40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();

        int D = (a1*b2 - a2*b1);
        System.out.println("D= "+D);
        int x = (c1*b2 - c2*b1)/D;
        System.out.println("X= "+x);
        int y = (a1*c2 - a2*c1)/D;
        System.out.println("Y= "+y);

        int C1 = a1*x + b1*y;
        System.out.println("C1= "+C1);
        int C2 = a2*x + b2*y;
        System.out.println("C2= "+C2);




    }
}
