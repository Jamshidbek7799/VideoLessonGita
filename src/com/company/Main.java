package com.company;

import java.util.Scanner;

public class Main {
//   ProKING
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a =new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
        }

        System.out.println("index = qiymati");
        for (int i = 1; i <=a.length-1 ; i+=2) {
            System.out.println("  "+i+ "   =   "+a[i]);
        }



    }
}
