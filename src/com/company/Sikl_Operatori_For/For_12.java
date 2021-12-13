package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_12 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextInt(), pr = 1;

        for (double i = 0; i <= n/10 ; i = i+0.1) {
            pr = pr * (i+1);
        }
        System.out.println(pr);

    }
}
