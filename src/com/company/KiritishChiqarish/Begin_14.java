package com.company.KiritishChiqarish;

import java.util.Scanner;

public class Begin_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double L = sc.nextDouble();

        int R = (int) (2 * 3.14 / L);
        int S = 2*R*R;

        System.out.println("Aylananing Radiusi= "+R+"\nAylananing Yuzasi= "+S);

    }
}
