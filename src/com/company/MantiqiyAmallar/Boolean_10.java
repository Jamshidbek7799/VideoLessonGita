package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean bool = (A%2==0 && B%2==1);

        System.out.println(bool);
    }
}