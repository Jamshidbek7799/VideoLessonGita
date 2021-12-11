package com.company.KiritishChiqarish;
import java.util.Scanner;

public class Begin_38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int D = B*B - 4*A*C;
        System.out.println("Diskriminant= "+D);

        int x1 = (int) ((-B+Math.sqrt(D))/2*A);
        int x2 = (int) ((-B-Math.sqrt(D))/2*A);
        System.out.println("X1= "+x1+"\nX2= "+x2);



    }
}
