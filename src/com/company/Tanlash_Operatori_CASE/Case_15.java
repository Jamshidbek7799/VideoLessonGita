    package com.company.Tanlash_Operatori_CASE;

import java.util.Scanner;

    // ProKing_New_Version
        public class Case_15 {
            public static void main(String[] args) {
               while (true){
                    Scanner sc = new Scanner(System.in);

                    System.out.println("\nKartaning qiymatini kiriting:");
                    System.out.println("6 - 10 gacha");
                    System.out.println("11 - valet");
                    System.out.println("12 - dama");
                    System.out.println("13 - karol");
                    System.out.println("14 - tuz");

                    int karta_qiymati = sc.nextInt();

                    System.out.println("Kartaning turini kiriting: ");
                    System.out.println("1-g'isht");
                    System.out.println("2-olma");
                    System.out.println("3-chillak");
                    System.out.println("4-qarg'a");

                    int karta_turi = sc.nextInt();

                    System.out.println("===================");

                      switch (karta_qiymati) {
                          case 6:
                              System.out.print("olti");
                              break;
                          case 7:
                              System.out.print("yetti");
                              break;
                          case 8:
                              System.out.print("sakkiz");
                              break;
                          case 9:
                              System.out.print("to'qqiz");
                              break;
                          case 10:
                              System.out.print("o'n");
                              break;
                          case 11:
                              System.out.print("valet");
                              break;
                          case 12:
                              System.out.print("dama");
                              break;
                          case 13:
                              System.out.print("karol");
                              break;
                          case 14:
                              System.out.print("tuz");
                              break;
                          default:
                              System.out.println("Kallang ishlimi uzi sani. \n6-14 orasidagi son kirit!");break;
                      }

                      if (karta_qiymati>5 && karta_qiymati<15){
                          switch (karta_turi){
                              case 1:
                                  System.out.println(" g'isht"); break;
                              case 2:
                                  System.out.println(" olma"); break;
                              case 3:
                                  System.out.println(" chillak"); break;
                              case 4:
                                  System.out.println(" qarg'a"); break;
                              default:
                                  System.out.println("Xato So'tak kartada 4 ta tur bor uzi.");break;
                          }
                      }

















               }
            }
        }
