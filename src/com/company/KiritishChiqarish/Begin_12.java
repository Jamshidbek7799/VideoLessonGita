package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = (int) Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        int P = a+b+c;

        System.out.println("Gipotenuzasi= "+c+"\nPerimetri= "+P);


    }
}
