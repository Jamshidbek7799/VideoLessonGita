
package com.company.ShartOperatori;

import java.util.Scanner;

public class if_28 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

          int yil = sc.nextInt();

          boolean kabisa ;
          if(((yil%4==0)&&(yil%100 != 0))||(yil%400==0))
              kabisa=true;
          else kabisa=false;
            System.out.println(kabisa);











        }
    }
}

