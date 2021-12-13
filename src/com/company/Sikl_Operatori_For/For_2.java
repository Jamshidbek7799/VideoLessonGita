package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();

            int cnt = 0;
            for (int i = a; i <=b; i++) {
                cnt++;
                System.out.println(i);
            }

            System.out.println("natija: "+cnt);


        }
    }
}
