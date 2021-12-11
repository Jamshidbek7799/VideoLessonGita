package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = (int) ((int) (4*Math.pow(x-3,6))-(7*Math.pow(x-3, 3)+2));
        System.out.println(y);


    }
}
