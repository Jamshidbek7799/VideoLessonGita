    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_
        public class Case_7 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);

                   System.out.println("\nSon kiriting");
                   double a = sc.nextDouble();


                   System.out.println("1 - kilogramm");
                   System.out.println("2 - milligramm");
                   System.out.println("3 - gramm");
                   System.out.println("4 - tonna");
                   System.out.println("5 - sentner");

                   int n = sc.nextInt();
                   System.out.println("natijasi: ");
                   switch (n) {
                       case 1: System.out.println(a);                         break;
                       case 2: System.out.println(a/1_000_000);               break;
                       case 3: System.out.println(a/1000);                    break;
                       case 4: System.out.println(a*1000);                    break;
                       case 5: System.out.println(a*100);                     break;
                       default:
                           System.out.println("xato ");
                           break;
                   }











               }



            }
        }
