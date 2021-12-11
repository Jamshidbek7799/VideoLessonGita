package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int hajmi = a*b*c;
        int sirti = 2*(a*b + b*c + a*c);

        System.out.println("Paralelepepidning hajmi= "+hajmi+"\nParalelepepidning sirti= "+sirti);

    }
}
