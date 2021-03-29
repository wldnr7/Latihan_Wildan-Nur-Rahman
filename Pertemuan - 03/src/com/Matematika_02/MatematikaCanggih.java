package com.Matematika_02;

public class MatematikaCanggih extends Matematika {

    protected int modulus(int a, int b){

        super.hasil = a % b;
        return super.hasil;
    }

    void show(){

        System.out.println("Hasil Modulus : " + super.hasil);
    }

    //Saya membuat method perkalian, pertambahan di parent class.

}
