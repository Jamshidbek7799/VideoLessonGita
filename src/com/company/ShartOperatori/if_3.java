package com.company.ShartOperatori;

import java.util.Scanner;

public class if_3 {
    public static void main(String[] args) {
       while (true){
           Scanner sc = new Scanner(System.in);

           int a = sc.nextInt();

           if (a>0 && a!=0){
               System.out.println(a+1);
           }else if (a==0){
               System.out.println(10);
           }else
               System.out.println(a-2);






       }
    }
}
