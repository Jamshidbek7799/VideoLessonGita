package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class M_5 {
    // ProKing_New_Version
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            for (int i = 1; i <=n ; i++) {
                if (i%3==0 && i%5!=0)
                    System.out.println(i);
            }







        }
    }
}