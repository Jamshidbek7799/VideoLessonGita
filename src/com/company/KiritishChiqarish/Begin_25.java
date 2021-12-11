package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = (int) (6*Math.pow(x,6))-(6*x*x)-7;
        System.out.println(y);


    }
}
