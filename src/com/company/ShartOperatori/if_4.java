package com.company.ShartOperatori;

import java.util.Scanner;

public class if_4 {
    public static void main(String[] args) {
       while (true){
           Scanner sc = new Scanner(System.in);

           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();

           int cnt = 0;
           if (a>0)
               cnt++;
           if (b>0)
               cnt++;
           if (c>0)
               cnt++;

           System.out.println(cnt);





       }
    }
}
