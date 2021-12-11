    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_18 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);


                   System.out.println("\n100 - 999:");
                   int son = sc.nextInt();

                   int yuzlar = son / 100;
                   int onlar = son / 10 % 10;
                   int birlar = son % 10;


                   System.out.println("=============================");
                   switch (yuzlar) {
                       case 1:
                           System.out.print("bir yuz");
                           break;
                       case 2:
                           System.out.print("ikki yuz");
                           break;
                       case 3:
                           System.out.print("uch yuz");
                           break;
                       case 4:
                           System.out.print("to'rt yuz");
                           break;
                       case 5:
                           System.out.print("besh yuz");
                           break;
                       case 6:
                           System.out.print("olti yuz");
                           break;
                       case 7:
                           System.out.print("yetti yuz");
                           break;
                       case 8:
                           System.out.print("sakkiz yuz");
                           break;
                       case 9:
                           System.out.print("to'qqiz yuz");
                           break;

                       default:
                           System.out.print("So'tak 100 - 999 orasinda kirit dab nichcha marta aytish garak\n");
                   }

                   if (son > 99 && son < 1000) {
                       switch (onlar) {
                           case 1:
                               System.out.print(" o'n");
                               break;
                           case 2:
                               System.out.print(" yigirma");
                               break;
                           case 3:
                               System.out.print(" o'ttiz");
                               break;
                           case 4:
                               System.out.print(" qirq");
                               break;
                           case 5:
                               System.out.print(" ellik");
                               break;
                           case 6:
                               System.out.print(" oltmish");
                               break;
                           case 7:
                               System.out.print(" yetmish");
                               break;
                           case 8:
                               System.out.print(" sakson");
                               break;
                           case 9:
                               System.out.print(" to'qson");
                               break;
                       }

                       switch (birlar) {
                           case 1:
                               System.out.print(" bir");
                               break;
                           case 2:
                               System.out.print(" ikki");
                               break;
                           case 3:
                               System.out.print(" uch");
                               break;
                           case 4:
                               System.out.print(" to'rt");
                               break;
                           case 5:
                               System.out.print(" besh");
                               break;
                           case 6:
                               System.out.print(" olti");
                               break;
                           case 7:
                               System.out.print(" yetti");
                               break;
                           case 8:
                               System.out.print(" sakkiz");
                               break;
                           case 9:
                               System.out.print(" to'qqiz");
                               break;
                       }
                   }


















               }
            }
        }
