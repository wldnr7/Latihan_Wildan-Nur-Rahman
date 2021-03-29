package com.Matematika_02;


public class MatematikaCanggihBeraksi {

    public static void main(String[] args) {

        //membuat object
        Matematika parentClass = new Matematika();
        MatematikaCanggih subClass = new MatematikaCanggih();

        //pertambahan
        parentClass.pertambahan(10, 15);
        parentClass.showPertambahan();

        //perkalian
        parentClass.perkalian(10, 15);
        parentClass.showPerkalian();


    }
}
