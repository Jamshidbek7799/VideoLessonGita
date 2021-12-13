package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_1 {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int k = sc.nextInt();

            for (int i = 1; i <=n ; i++) {
                System.out.println(i+" "+k);
            }


        }
    }
}
