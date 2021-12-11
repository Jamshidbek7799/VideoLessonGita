package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();

        int a = (int) Math.sqrt((Math.pow(x1-x2, 2)+(Math.pow(y1-y2, 2))));
        int b = (int) Math.sqrt((Math.pow(x2-x3, 2)+(Math.pow(y2-y3, 2))));
        int c = (int) Math.sqrt((Math.pow(x3-x1, 2)+(Math.pow(y3-y1, 2))));

        int P = (a+b+c)/2;
        int s = (int) Math.sqrt(P*(P-a)*(P-b)*(P-c));
        System.out.println("P= "+P+"\nS= "+s);



    }
}
