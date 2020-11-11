package com.example.basiclab;

import android.app.Application;

import androidx.fragment.app.Fragment;

public class Aplikacja extends Application {
// te zmienne przetrwaja
    private static int kolor1;
    private static int kolor2;
    private static int kolor3;
    public static Fragment frag1;
    public static Fragment frag2;
    public static Fragment frag3;



    public Aplikacja(){


        super();
        frag1=null;
        frag2=null;
        frag3=null;

    }

    public static void zapiszKolor1(int kolors){
        kolor1=kolors;
    }

public static int zwrocKolor1(){

        return  kolor1;
}
    public static void zapiszKolor2(int kolors){
        kolor2=kolors;
    }

    public static int zwrocKolor2(){

        return  kolor2;
    }
    public static void zapiszKolor3(int kolors){
        kolor3=kolors;
    }

    public static int zwrocKolor3(){

        return  kolor3;
    }

}
