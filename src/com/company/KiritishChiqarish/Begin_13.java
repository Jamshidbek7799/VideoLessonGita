package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double R1 = sc.nextDouble();
        double R2 = sc.nextDouble();

        double S1 = Math.PI * R1 * R1;
        double S2 = Math.PI * R2 * R2;
        double S3 = Math.PI * (R1 - R2);
        System.out.println("S1= "+ S1 +"\nS2= " + S2 +"\nS3= " + S3);
    }
}
