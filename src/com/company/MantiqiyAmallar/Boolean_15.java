package misol.MantiqiyAmalllar;

import java.util.Scanner;

public class Boolean_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        boolean bool = (A<0 && B<0 && C>0 || A>0 && B<0 && C<0 || A<0 && B>0 && C<0);

        System.out.println(bool);
    }
}
