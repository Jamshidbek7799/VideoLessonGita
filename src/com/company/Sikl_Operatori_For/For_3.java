package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_3 {
//    ProKing_New_Version
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int cnt = 0;
             for (int i = b-1; i > a ; i--) {
                System.out.print(i+" ");
                cnt++;
             }

             System.out.println("Natija: "+cnt);

        }

}
