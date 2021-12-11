    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_20 {
            public static void main(String[] args) {
               while (true){
                   Scanner sc = new Scanner(System.in);

                   System.out.println("\n=======");
                   int D1 = sc.nextInt();
                   int M1 = sc.nextInt();

                   int D2 = sc.nextInt();
                   int M2 = sc.nextInt();

                   switch (M1){
                       case 1: if (D1>19 && D2<19 && M2==2)System.out.print("Qovg'a");break;
                       case 2: if (D1>18 && D2<21 && M2==3)System.out.print("Baliq");break;
                       case 3: if (D1>20 && D2<20 && M2==4)System.out.print("Qo'y");break;
                       case 4: if (D1>19 && D2<21 && M2==5)System.out.print("Buzoq");break;
                       case 5: if (D1>20 && D2<22 && M2==6)System.out.print("Egizaklar");break;
                       case 6: if (D1>21 && D2<23 && M2==7)System.out.print("Qisqichbaqa");break;
                       case 7: if (D1>22 && D2<23 && M2==8)System.out.print("Arslon");break;
                       case 8: if (D1>22 && D2<23 && M2==9)System.out.print("Parizod");break;
                       case 9: if (D1>22 && D2<23 && M2==10)System.out.print("Tarozi");break;
                       case 10: if (D1>22 && D2<23 && M2==11)System.out.print("Chayon");break;
                       case 11: if (D1>22 && D2<22 && M2==12)System.out.print("O'qotar");break;
                       case 12: if (D1>21 && D2<20 && M2==1)System.out.print("Echki");break;
                       default:
                           System.out.println("xato");break;
                   }



















               }
            }
        }
