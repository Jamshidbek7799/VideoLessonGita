package com.company.ShartOperatori;

import java.util.Scanner;

public class if_11 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();


            if (a!=b){
                System.out.println("A= "+Math.max(a,b)+" B= "+Math.max(a,b));
            }else System.out.println("A= "+0+" B= "+0);



        }
    }
}
