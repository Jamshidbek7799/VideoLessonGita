    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_16 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);

                   System.out.println("\n20 - 69 orasida yoshni kiriting:");
                   int yosh = sc.nextInt();

                   int butun = yosh/10;
                   int qoldiq = yosh%10;

                   System.out.println("=============================");
                   switch (butun){
                       case 2:
                           System.out.print("yigirma ");break;
                       case 3:
                           System.out.print("o'ttiz ");break;
                       case 4:
                           System.out.print("qirq ");break;
                       case 5:
                           System.out.print("ellik ");break;
                       case 6:
                           System.out.print("oltmish ");break;
                       default:
                           System.out.print("So'tak 20 - 69 yosh orasinda kirit dab nichcha marta aytish garak\n");
                   }

                   if (yosh>19 && yosh<70) {
                       switch (qoldiq) {
                           case 0:
                               System.out.println("yosh");
                               break;
                           case 1:
                               System.out.println("bir yosh");
                               break;
                           case 2:
                               System.out.println("ikki yosh");
                               break;
                           case 3:
                               System.out.println("uch yosh");
                               break;
                           case 4:
                               System.out.println("to'rt yosh");
                               break;
                           case 5:
                               System.out.println("besh yosh");
                               break;
                           case 6:
                               System.out.println("olti yosh");
                               break;
                           case 7:
                               System.out.println("yetti yosh");
                               break;
                           case 8:
                               System.out.println("sakkiz yosh");
                               break;
                           case 9:
                               System.out.println("to'qqiz yosh");
                               break;
                           default:
                               System.out.println("XatoBoshmisanyo !? ");
                       }
                   }


















               }
            }
        }
