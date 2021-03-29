package com.Matematika;

 class MatematikaCanggihBanget extends MatematikaCanggih {

    protected int pertambahanTiga(int a, int b, int c){


        super.hasil = a + b + c;

        return super.hasil;

    }
    void showPertambahanTiga(){
        System.out.println("Hasil pertambahan tiga : " + super.hasil);
    }
}
