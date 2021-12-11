package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        int d = (int) (Math.sqrt(4*S) / Math.PI);
        int r = (int) Math.sqrt(S/Math.PI);

        System.out.println("Doiraning yuzi= "+ d);
        System.out.println("Doiraning radiusi= "+ r);

    }
}
