package com.company.ShartOperatori;

import java.util.Scanner;

public class if_21 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();


                if (x>0 && y>0 || x<0 && y<0) System.out.println(3);
                else if (x==0 || y==0) {
                        if (x == 0 && y > 0 || y < 0) System.out.println(1);
                        else if (y==0 && x>0 || x<0) System.out.println(2);
                             else System.out.println(0);
                }
            }











    }
}

