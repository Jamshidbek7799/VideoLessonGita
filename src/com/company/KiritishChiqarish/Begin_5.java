package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int hajmi = (int) Math.pow(a,3);
        int sirti = (int) Math.pow(a, 2)*6;

        System.out.println("Kubning hajmi= "+hajmi+"\nKubning sirti= "+sirti);

    }
}
