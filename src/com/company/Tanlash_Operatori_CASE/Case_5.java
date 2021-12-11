    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    public class Case_5 {
        public static void main(String[] args) {
           while (true){
               Scanner sc = new Scanner(System.in);

               System.out.println("\nikkita son kiriting");
               int a = sc.nextInt();
               int b = sc.nextInt();

               System.out.println("1 - qo'shish");
               System.out.println("2 - ayirish");
               System.out.println("3 - ko'paytirish");
               System.out.println("4 - bo'lish");

               int n = sc.nextInt();
               System.out.println("natijasi: ");
               switch (n) {
                   case 1: System.out.println(a+b);                break;
                   case 2: System.out.println(a-b);                break;
                   case 3: System.out.println(a*b);                break;
                   case 4: System.out.println(a/b);                break;
                   default:
                       System.out.println("xato ");
                       break;
               }











           }



        }
    }
