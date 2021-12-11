    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_
        public class Case_9 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);

                   System.out.println("==============\nSanani kiriting: ");
                   int d = sc.nextInt();
                   System.out.println("Oyni kiriting: ");
                   int m = sc.nextInt();


                   if (d<32){
                       switch (m){
                           case 1: if (d==31) {
                               System.out.println(1 + "-fevral");                            break;
                           }else if (d<31) System.out.println(d+1 + "-Yanvar");              break;

                           case 2:  if (d==28){
                               System.out.println(1 + "-mart");                              break;
                           }else if (d<28) System.out.println(d+1 + "-Fevral");              break;

                           case 3: if (d==31) {
                               System.out.println(1 + "-aprel");                             break;
                           }else if (d<31) System.out.println(d+1 + "-Mart");                break;

                           case 4: if (d==30) {
                               System.out.println(1 + "-may");                               break;
                           }else if (d<30) System.out.println(d+1 + "-Aprel");               break;

                           case 5: if (d==31) {
                               System.out.println(1 + "-iyun");                              break;
                           }else if (d<31) System.out.println(d+1 + "-May");                 break;

                           case 6: if (d==3) {
                               System.out.println(1 + "-iyul");                              break;
                           }else if (d<30) System.out.println(d+1 + "-Iyun");                break;

                           case 7: if (d==31) {
                               System.out.println(1 + "-avgust");                            break;
                           }else if (d<31) System.out.println(d+1 + "-Iyul");                break;

                           case 8: if (d==31) {
                               System.out.println(1 + "-sentyabr");                           break;
                           }else if (d<31) System.out.println(d+1 + "-Avgust");               break;

                           case 9: if (d==30) {
                               System.out.println(1 + "-oktyabr");                            break;
                           }else if (d<30) System.out.println(d+1 + "-Sentyabr");             break;

                           case 10: if (d==31) {
                               System.out.println(1 + "-noyabr");                             break;
                           }else if (d<31) System.out.println(d+1 + "-Oktyabr");              break;

                           case 11: if (d==30) {
                               System.out.println(1 + "-dekabr");                             break;
                           }else if (d<30) System.out.println(d+1 + "-Noyabr");               break;

                           case 12: if (d==31) {
                               System.out.println(1 + "-yanvar");                             break;
                           }else if (d<31) System.out.println(d+1 + "-Dekabr");               break;
                           default:
                               System.out.println("Xatolik yuz berdi"); break;
                       }
                   }else System.out.println("Bunday sana mavjudligiga ishonmayman !\nKallangni ishlatsang bo'lmaydimi? :(");














               }



            }
        }
