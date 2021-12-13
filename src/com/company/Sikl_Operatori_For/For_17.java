package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_17 {
//    ProKing_New_Version 

    public static void  main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
        int n=sc.nextInt();
        int cnt =0;
        for (int i = 2; i <=n ; i++) {
            System.out.println(Math.pow(a, i));

            cnt +=Math.pow(a, i);
        }
        System.out.println("result: "+cnt+1+a);















    }
}
