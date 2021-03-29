package com.Matematika_03;

public class MatematikaCanggih extends Matematika {

    //pengurangan
    protected void Pengurangan(int a,int b){

        int hasil = a - b;
        System.out.println("Hasil : " + hasil);
    }
    //overloading pengurangan
    protected void Pengurangan(double a, double b, double c){

        double hasil = a - b - c;
        System.out.println("Hasil : " + hasil);
    }

    //perkalian
    protected void Perkalian(int a, int b){

        int hasil = a * b;
        System.out.println("Hasil : " + hasil);
    }
    //overloading perkalian
    protected void Perkalian(double a, double b, double c){

        double hasil = a * b * c;
    }

    //pembagian
    protected void Pembagian(int a, int b){

        int hasil = a / b;
        System.out.println("Hasil : " + hasil);
    }
    //overloading pembagian
    protected void Pembagian(double a, double b, double c){

        double hasil = a / b / c;
    }



}
