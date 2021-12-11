package com.company.MantiqiyAmallar;

import java.util.Scanner;

public class Boolean_37 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            boolean b1 = true;
            int X1 = (x1 - x2);
            int Y1 = (y1 - y2);

            if (X1 == 2 && Y1 == 2 | X1 == -2 && Y1 == -2) {
                b1 = false;

                if (b1 == true) {
                    if ((x1 >= 1 && x1 <= 8) && (y1 >= 1 && y1 <= 8) && (x2 >= 1 && x2 <= 8) && (y2 >= 1 && y2 <= 8)) {
                        int xxx = x1 - x2;
                        int yyy = y1 - y2;
                        boolean bool = false;
                        if (xxx == 1 && yyy == 1 | yyy == 0 | yyy == -1 ||
                                xxx == -1 && yyy == 1 | yyy == 0 | yyy == -1 ||
                                xxx == 0 && yyy == 1 | yyy == 0 | yyy == -1) {
                            bool = true;
                            System.out.println(bool);
                        }
                        System.out.println(bool);
                    } else
                        System.out.println("so'tak 1 dan 8 gacha kirit");

                } else
                    System.out.println("errror");


            }
        }
    }
}
