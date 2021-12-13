package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_10 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int b = sc.nextInt();

        float cnt=0;
        for (float i = 2; i <=b ; i++) {
            System.out.println(i+" = "+1+1/i);
          cnt += 1+1/i;
        }
        System.out.println("natija: "+cnt);


    }
}
