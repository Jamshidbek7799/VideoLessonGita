    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;
// ProKing_
    public class Case_6 {
        public static void main(String[] args) {
           while (true){
               Scanner sc = new Scanner(System.in);

               System.out.println("\nSon kiriting");
               double a = sc.nextDouble();


               System.out.println("1 - detsimetr");
               System.out.println("2 - kilometr");
               System.out.println("3 - metr");
               System.out.println("4 - millimetr");

               int n = sc.nextInt();
               System.out.println("natijasi: ");
               switch (n) {
                   case 1: System.out.println(a/10);                 break;
                   case 2: System.out.println(a*1000);               break;
                   case 3: System.out.println(a);                    break;
                   case 4: System.out.println(a/1000);               break;
                   default:
                       System.out.println("xato ");
                       break;
               }











           }



        }
    }
