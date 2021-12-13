package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class M_4 {
    // ProKing_New_Version
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int cnt=0;
            for (int i = 1; i <=n ; i++) {
                for (int j = 1; j <i ; j++) {
                    if (i%j==0)
                        cnt += j;
                }

                if (cnt==i)
                    System.out.println(i);
                cnt=0;
            }







        }
    }
}