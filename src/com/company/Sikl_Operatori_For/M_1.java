package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class M_1{

    // ProKing_New_Version
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            if (n%i==0)
            System.out.print(i+",");
        }

    }
}
