package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class M_3 {

    // ProKing_New_Version
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int cnt=0;
        for (int i = 1; i <n ; i++) {
            if (n%i==0)
                cnt += i;
        }

        if (cnt==n) {
            System.out.println("Mukammal son");
        } else System.out.println("Error");



    }
}
