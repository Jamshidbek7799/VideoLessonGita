package com.company;


import java.util.Scanner;

public class Main {
//   T/me:@JamshidYuldashev
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for (int i = 0; i <arr.length ; i++) { // massiv elementlarini o'qib olish
            arr[i]=sc.nextInt();
        }

        int max = maxOfArray(arr, 0);
        System.out.println(max);


    }

    // rekursiv funksiya
    public static int maxOfArray(int []arr, int index){

        if (index == arr.length - 1){
            return arr[index];
        }

        int maxInSmollerArray = maxOfArray(arr, index + 1);
        if (maxInSmollerArray> arr[index]){
            return maxInSmollerArray;
        }else {
            return arr[index];
        }
    }



}
