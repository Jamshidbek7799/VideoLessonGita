package com.company.Video;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean A = true, B = false, C = true, D = false;

        System.out.println(((A && B) || (C && D) || (A || B)));
    }
}
