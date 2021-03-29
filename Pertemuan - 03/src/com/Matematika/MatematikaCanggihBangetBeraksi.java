package com.Matematika;

class MatematikaCanggihBangetBeraksi {

    public static void main(String[] args) {

        //membuat object
        MatematikaCanggih matematikaku = new MatematikaCanggih();
        MatematikaCanggihBanget matematikaku2 = new MatematikaCanggihBanget();

        System.out.println("=== Program ===");
        //pertambahan
        matematikaku.pertambahan(5,2);
        matematikaku.showPertambahan();
        //perkalian
        matematikaku.perkalian(5,5);
        matematikaku.showPerkalian();
        //modulus
        matematikaku.modulus(5,3);
        matematikaku.showModulus();
        //pertambahan tiga
        matematikaku2.pertambahanTiga(5,2,5);
        matematikaku2.showPertambahanTiga();
    }
}
