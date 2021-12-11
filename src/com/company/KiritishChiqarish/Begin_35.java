package com.company.KiritishChiqarish;
import java.util.Scanner;

public class Begin_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int U = sc.nextInt();
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();

        int S1 = (V+U)*T1; // oqim bo'yicha
        int S2 = (V-U)*T2; // oqimga qarshi
        System.out.println("oqim bo'yicha= "+S1+"\noqimga qarshi= "+S2);




    }
}
