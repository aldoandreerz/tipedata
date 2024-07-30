package com.juaracoding;

public class Main {
    public static void main(String[] args) {

        //tipe data
        String name = "Aldo Andre";
        byte umur = 20;
        char gender = 'L';
        int tinggiBadan = 170;
        System.out.println("Nama : "+name);
        System.out.println("\nUmur: "+umur);
        System.out.println("\nGender: "+gender);
        System.out.println("\nTinggi: "+tinggiBadan);

        //auto cast
        int an = 100;
        float bn = an;
        System.out.println(bn);

        //manual cast
        int ax = 98;
        float bx = (float) ax;
        System.out.println(bx);
     }
}

