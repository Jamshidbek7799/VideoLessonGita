package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println(Math.sqrt((Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2)))));
    }
}
