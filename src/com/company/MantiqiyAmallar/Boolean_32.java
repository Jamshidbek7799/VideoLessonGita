package misol.MantiqiyAmalllar;

import java.util.Scanner;

public class Boolean_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean bool = (a*a+b*b==c*c || c*c+b*b==a*a || a*a+c*c==b*b);

        System.out.println(bool);
    }
}
