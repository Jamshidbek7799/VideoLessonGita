package com.company.KiritishChiqarish;
import java.util.Scanner;

public class Begin_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = (int) ((180/Math.PI)*a);
        System.out.println(b);
    }
}
