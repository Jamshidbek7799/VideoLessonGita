package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_6 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (float i = 12; i <20 ; i+=2) {
            System.out.println(i/10*n);
        }
        System.out.println(2*n);

    }
}
