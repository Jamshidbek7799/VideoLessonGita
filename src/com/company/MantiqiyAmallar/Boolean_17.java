package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();

        boolean bool = (A>99 && A<1000 && A%2==1);
        System.out.println(bool);
    }
}
