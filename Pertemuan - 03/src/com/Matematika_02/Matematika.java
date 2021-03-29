package com.Matematika_02;

public class Matematika {

    protected int hasil;

    protected int perkalian(int a, int b){

        this.hasil = a * b;

        return this.hasil;

    }
    void showPerkalian(){
        System.out.println("Hasil Perkalian : " + this.hasil);
    }

    protected int pertambahan(int a, int b){

        this.hasil = a + b;
        return this.hasil;
    }
    void showPertambahan(){
        System.out.println("Hasil Pertambahan : " + this.hasil);
    }

}
