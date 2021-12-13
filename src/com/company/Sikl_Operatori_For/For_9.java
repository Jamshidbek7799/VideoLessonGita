package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_9 {
//    ProKing_New_Version 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt=0;
        for (int i = a; i <=b ; i++) {
            System.out.println(i+"="+i*i);
          cnt += i*i;
        }
        System.out.println("natija: "+cnt);


    }
}
