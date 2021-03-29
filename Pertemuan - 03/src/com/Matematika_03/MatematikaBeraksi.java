package com.Matematika_03;

public class MatematikaBeraksi {

    public static void main(String[] args) {

        //membuat object
        Matematika superClass = new Matematika();
        MatematikaCanggih subClass = new MatematikaCanggih();

        System.out.println("=== Program ===");
        //uji konsep overloading pertambahan (dari class Matematika)

        superClass.Pertambahan(23,34);
        superClass.Pertambahan(12.5D,28.7D,14.2D); // overloading

        superClass.Pertambahan(12,28);
        superClass.Pertambahan(3.4,4.9);




    }
}
