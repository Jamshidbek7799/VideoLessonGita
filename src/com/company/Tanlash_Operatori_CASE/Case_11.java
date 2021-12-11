    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_11 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);
                   System.out.println("=======\nRobot boshlang'ich holati");

                   System.out.println("\ns = shimol");
                   System.out.println("j = janub");
                   System.out.println("q = sharq");
                   System.out.println("g = g'arb");

                   String c = sc.nextLine();

                   System.out.println("Kamandalarni tanlang K1 K2:");

                   System.out.println("\n0 - o'ngga burilish");
                   System.out.println("1 - chapga burilish");
                   System.out.println("2 - 180 gradus burilish");
                   int k1 = sc.nextInt();
                   int k2 = sc.nextInt();



                   switch (c){
                       case "s": if (k1==2 && k2==2){
                           System.out.println("Shimol");break;
                       }else
                       if (k1==1 && k2==1 || k1==0 && k2==0){
                           System.out.println("Janub");break;
                       }else
                       if (k1==1 && k2==2 || k1==2 && k2==1){
                           System.out.println("Sharq");break;
                       }else
                       if (k1==0 && k2==2 || k1==2 && k2==0){
                           System.out.println("G'arb");break;
                       }


                       case "j": if (k1==2 && k2==2){
                           System.out.println("Janub");break;
                       }else
                       if (k1==1 && k2==1 || k1==0 && k2==0){
                           System.out.println("Shimol");break;
                       }else
                       if (k1==1 && k2==2 || k1==2 && k2==1){
                           System.out.println("G'arb");break;
                       }else
                       if (k1==0 && k2==2 || k1==2 && k2==0) {
                           System.out.println("Sharq");break;
                       }

                       case "q": if (k1==2 && k2==2){
                           System.out.println("Sharq");break;
                       }else
                       if (k1==1 && k2==1 || k1==0 && k2==0){
                           System.out.println("G'arb");break;
                       }else
                       if (k1==1 && k2==2 || k1==2 && k2==1){
                           System.out.println("Janub");break;
                       }else
                       if (k1==0 && k2==2 || k1==2 && k2==0) {
                           System.out.println("Shimol");break;
                       }

                       case "g": if (k1==2 && k2==2){
                           System.out.println("G'arb");break;
                       }else
                       if (k1==1 && k2==1 || k1==0 && k2==0){
                           System.out.println("Sharq");break;
                       }else
                       if (k1==1 && k2==2 || k1==2 && k2==1){
                           System.out.println("Shimol");break;
                       }else
                       if (k1==0 && k2==2 || k1==2 && k2==0) {
                           System.out.println("Janub");break;
                       }

                   }














               }



            }
        }
