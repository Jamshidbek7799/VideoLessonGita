package com.company.ShartOperatori;

import java.util.Scanner;

public class if_5 {
    public static void main(String[] args) {
       while (true){
           Scanner sc = new Scanner(System.in);

           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           int cnt = 0;
           int nt = 0;

           if (a>0){ cnt++; }else if (a<0) nt++;

           if (b>0) { cnt++; }else if (b<0)  nt++;

           if (c>0) { cnt++; }else if (c<0)  nt++;

           System.out.println(cnt +" ta Musbat");
           System.out.println(nt +" ta Manfiy");

       }
    }
}
