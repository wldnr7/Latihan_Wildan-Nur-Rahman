package com.Bank;

public class bankBeraksi {

    public static void main(String[] args) {

        //membuat object
        Bank myBank = new Bank(10000);
        myBank.getSaldo(); // get saldo

        System.out.println("");

        //tambah saldo
        System.out.println("-- Simpan Uang --");
        myBank.simpanUang(50000);
        myBank.getSaldo();

        System.out.println("");

        //ambil saldo
        System.out.println("-- Ambil uang --");
        myBank.ambilUang(15000);
        myBank.getSaldo();
    }
}
