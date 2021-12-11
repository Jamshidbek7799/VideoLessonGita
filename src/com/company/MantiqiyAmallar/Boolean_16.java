package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();

        boolean bool = (A>9 && A<100 && A%2==0);
        System.out.println(bool);
    }
}
