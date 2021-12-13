package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_11 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        double  cnt=0;
        for (int i = 1; i <=n ; i++) {
            System.out.println(i+" = "+Math.pow(n, 2)+Math.pow(n+i, 2));
            cnt += Math.pow(n, 2)+Math.pow(n+i, 2);
        }
        System.out.println("natija: "+cnt + Math.pow(2 * n, 2));


    }
}
