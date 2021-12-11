package com.company.ShartOperatori;

import java.util.Scanner;

public class if_22 {
    public static void main(String[] args) {
            while (true){
                Scanner sc = new Scanner(System.in);

                    int x = sc.nextInt();
                    int y = sc.nextInt();



                if (x > 0 && y > 0) System.out.println(" I chorak");
                if (x > 0 && y < 0) System.out.println(" IV chorak");
                if (x < 0 && y > 0) System.out.println(" II chorak");
                if (x < 0 && y < 0) System.out.println(" III chorak");




            }
    }
}
