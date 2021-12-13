package com.company.Sikl_Operatori_For;

import java.util.Scanner;

public class For_14 {
//    ProKing_New_Version 
static int sumOfSeries(int n)
{
    int sum = 0;
    for (int i = 1; i <= n; i++){
        System.out.println(sum + (2 * i - 1) * (2 * i - 1));
        sum = sum + (2 * i - 1) * (2 * i - 1);
    }
    return sum;
}

    // Driver code
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( sumOfSeries(n));
    }
}
