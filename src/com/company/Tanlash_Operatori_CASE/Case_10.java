    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_10 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);
                   System.out.println("=======\nRobot yo'nalishi");

                   System.out.println("\ns = shimol");
                   System.out.println("j = janub");
                   System.out.println("q = sharq");
                   System.out.println("g = g'arb");
                   String y = sc.nextLine();

                   System.out.println("Kamandani tanlang :");

                   System.out.println("\n0 - davom ettirish");
                   System.out.println("1 - chapga burilish");
                   System.out.println("2 - o'nga burilish");
                   int k = sc.nextInt();

                   switch (y){
                       case "s": if (k>0){
                           if (k==1){ System.out.println("Shimoli - G'arb");  break;
                           }else System.out.println("Shimoli - Sharq");       break;
                       }else System.out.println("Shimol");                    break;


                       case "j": if (k>0){
                           if (k==1){ System.out.println("Janubi - Sharq");  break;
                           }else System.out.println("Janubi - G'arb");       break;
                       }else System.out.println("janub");                    break;

                       case "q": if (k>0){
                           if (k==1){ System.out.println("Shimoli - Sharq"); break;
                           }else System.out.println("Janubi - Sharq");       break;
                       }else System.out.println("Sharq");                    break;

                       case "g": if (k>0){
                           if (k==1){ System.out.println("Janubi - G'arb");  break;
                           }else System.out.println("Shimoli - G'arb");      break;
                       }else System.out.println("G'arb");                    break;

                   }














               }



            }
        }
