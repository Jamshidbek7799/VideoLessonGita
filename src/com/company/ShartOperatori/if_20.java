package misol.ShartOperatori_IF;

import java.util.Scanner;

public class if_20 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int X1 = Math.abs(c-a);
            int X2 = Math.abs(b-a);

            if (X1 != X2){
                if (Math.min(X1,X2)==X1)
                    System.out.println(c+" Nuqta / "+ X1+" Masofa");
                else if (Math.min(X1,X2)==X2)
                    System.out.println(b+" Nuqta / "+ X2+" Masofa");
            }else System.out.println("[ "+c+" / "+b+" ]  "+X1+"-ta masofa" );


        }
    }
}

