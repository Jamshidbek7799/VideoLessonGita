package com.company.ShartOperatori;

import java.util.Scanner;

public class if_9 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a!=0 && b!=0) {
                if (a != b) {
                    if (a < b) System.out.println(a + " " + b); //A<B
                    else {                                      // B<A
                        if (a>0 && b>0) System.out.println(a+" "+b*-1); // a>0 va b>0
                        else {                                          // a<0 va b<0
                            if (a > b & a>0) System.out.println(a*-1 + " " + b*-1 );
                            else System.out.println(a + " " + b*-1 );
                        }
                    }
                } else  if (a < 0 && b < 0) System.out.println(a + " " + Math.abs(b));
                        else System.out.println((a * -1) + " " + b);
            }else System.out.println("Bunday son kiritma So'tak!");





        }
    }
}
