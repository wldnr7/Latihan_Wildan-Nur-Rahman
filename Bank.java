package com.Bank;

public class Bank {

    int saldo;

    Bank(int saldo){
        System.out.println("=== Selamat datang di bank ABC ===");
        this.saldo = saldo;

    }
    void getSaldo(){
        System.out.println("Saldo saat ini : Rp." + this.saldo);
    }

    void simpanUang(int tambahUang){

        this.saldo += tambahUang;

        System.out.println("Simpan Uang    : Rp." + tambahUang);
    }
    void ambilUang(int ambilSaldo){

        this.saldo -= ambilSaldo;
        System.out.println("Ambil Uang     : Rp." + ambilSaldo);
    }
}
