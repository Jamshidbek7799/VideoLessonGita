package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_13 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();

       double cnt = 0 ;
//      s= 1.1 - 1.2 + 1.3 - ...
        for (int i = 1; i<=n ; i++) {
            cnt +=Math.pow(-1, i+1)*(1.0+(double)i/10);
        }
        System.out.println("result: "+cnt);

        sc.close();
    }
}
