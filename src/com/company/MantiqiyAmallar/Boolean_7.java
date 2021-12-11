package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean bool = (A<B && B<C);
        System.out.println(bool);

    }
}
