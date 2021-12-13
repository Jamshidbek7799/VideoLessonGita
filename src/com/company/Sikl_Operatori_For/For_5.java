package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_5 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (float i = 1; i <10 ; i++) {
            System.out.println(i % 10 * n);
        }
        System.out.println(1*n);

    }
}
