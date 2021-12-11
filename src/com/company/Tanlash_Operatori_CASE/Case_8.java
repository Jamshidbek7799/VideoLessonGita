    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_
        public class Case_8 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);

                   System.out.println("\nSanani kiriting: ");
                   int d = sc.nextInt();
                   System.out.println("Oyni kiriting: ");
                   int m = sc.nextInt();


                   if (d<32){
                       switch (m){
                           case 1: if (d<=31) System.out.println(d + "-Yanvar");                break;
                           case 2: if (d<=28) System.out.println(d + "-Fevral");                break;
                           case 3: if (d<=31) System.out.println(d + "-Mart");                break;
                           case 4: if (d<=30) System.out.println(d + "-Aprel");                break;
                           case 5: if (d<=31) System.out.println(d + "-May");                break;
                           case 6: if (d<=30) System.out.println(d + "-Iyun");                break;
                           case 7: if (d<=31) System.out.println(d + "-Iyul");                break;
                           case 8: if (d<=31) System.out.println(d + "-Avgust");                break;
                           case 9: if (d<=30) System.out.println(d + "-Sentyabr");                break;
                           case 10:if (d<=31) System.out.println(d + "-Oktyabr");                break;
                           case 11:if (d<=30) System.out.println(d + "-Noyabr");                break;
                           case 12:if (d<=31) System.out.println(d + "-Dekabr");                break;
                           default:
                               System.out.println("Xatolik yuz berdi"); break;
                       }
                   }else System.out.println("Bunday sana mavjudligiga ishonmayman !\nKallangni ishlatsang bo'lmaydimi? :(");














               }



            }
        }
