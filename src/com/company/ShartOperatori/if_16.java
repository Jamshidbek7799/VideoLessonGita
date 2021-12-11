package com.company.ShartOperatori;

import java.util.Scanner;

public class if_16 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a<b && b<c){
                System.out.println(a*2+" "+b*2+" "+c*2);
            }else {
                System.out.println(a*-1+"  "+b*-1+" "+c*-1);
            }





        }
    }
}

