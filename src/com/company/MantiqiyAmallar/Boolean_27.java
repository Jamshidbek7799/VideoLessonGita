package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean bool = (x<0 && y>0 || x<0 && y<0);

        System.out.println(bool);
    }
}
