package misol.MantiqiyAmalllar;

import java.util.Scanner;

public class Boolean_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean bool = (a==b && a+b>c || b==c && b+c>a || a==c && a+c>b);

        System.out.println(bool);
    }
}
