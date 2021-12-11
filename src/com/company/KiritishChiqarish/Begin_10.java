package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int yigindi = a+b;
        int kopaytma = a*b;

        System.out.println("yig'indi= "+yigindi+"\nko'paytma= "+kopaytma+"\na kv= "+Math.pow(a, 2)+"\nb kv= "+Math.pow(b, 2));


    }
}
