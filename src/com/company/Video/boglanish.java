package com.company.Video;

public class boglanish {
    public static void main(String[] args) {
        Shakklar shakklar = new Shakklar();
        shakklar.uchburchak();
        shakklar.aylana();
        shakklar.kvadrat();
        shakklar.togri_tortburchak();

    }
}

interface Yuzalar{
    void uchburchak();
    void aylana();
    void kvadrat();
    void togri_tortburchak();
}

class Shakklar implements Yuzalar{

    @Override
    public void uchburchak() {
        int a = 5;
        System.out.println("Muntazam uchburchakning yuzasi: "+ (Math.sqrt(3)*a)/2);
    }

    @Override
    public void aylana() {
        int Radiusi = 5;
        System.out.println("Aylananing yuzasi: "+ Math.PI*Radiusi*Radiusi);
    }

    @Override
    public void kvadrat() {
        int a = 5;
        System.out.println("Kvadratning yuzasi: "+ a*a);
    }

    @Override
    public void togri_tortburchak() {
        int a = 5;
        int b = 10;
        System.out.println("To'g'ri to'tburchakning yuzasi: "+ (a*b));
    }
}
