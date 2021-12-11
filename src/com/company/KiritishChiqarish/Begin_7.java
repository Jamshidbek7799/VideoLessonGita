package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        int L_Uzunligi = (int) Math.PI * R * 2;
        int S_Yuzasi = (int) Math.PI * (int) Math.pow(R, 2);

        System.out.println("Doiraning uzunligi= "+L_Uzunligi+"\nDoiraning yuzasi= "+S_Yuzasi);
    }
}
