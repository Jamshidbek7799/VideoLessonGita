package misol.ShartOperatori_IF;

import java.util.Scanner;

public class if_15 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int A = a + b;
            int B = a + c;
            int C = b + c;


            if (A!=B && B!=C && A!=C){
                if ((A > B && B > C || A > C && C > B ) || (A>C && A<B || A>B && A<C))
                    System.out.println(A);  // katta

                if ((B > C && C > A || B > A && A > C) || (B>A && B<C || B>C && B<A))
                    System.out.println(B);

                if ((C > A && A > B || C > B && B > A) || (C>A && C<B || C>B && C<A))
                    System.out.println(C);
            }else
                System.out.println("O'zaro teng");






        }
    }
}

