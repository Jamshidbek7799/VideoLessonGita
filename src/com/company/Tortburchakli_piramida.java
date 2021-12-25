package com.company;

public class Tortburchakli_piramida {

    // S asosni aniqlash
    static  void S_asos(int a, int b){
        System.out.println("S asosga ko'ra : "+a*b);
    }

    // S yon tominini aniqlash
    static void S_yon(int h, int a, int b){
        System.out.println("S yonga ko'ra : "+h*(a+b));
    }

    // S to'la yuzasini aniqlash
    static void S_tola(int S_asos, int S_yon){
        System.out.println("S to'la yuzi: "+S_asos+S_yon);
    }

    // T.P ni Hajmini aniqlash
    static void Hajmi(int S_asos, int H ){
        System.out.println("Hajm topish : "+1/3*S_asos*H);
    }



}
