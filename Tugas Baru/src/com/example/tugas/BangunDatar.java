package com.example.tugas;

public abstract class BangunDatar implements Bentuk { //abstract class
    private String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public void printDetail() {
        System.out.println("Bangun datar yang akan dihitung adalah "+ this.nama);
    }

    public String getNama() {
        return nama;
    }

}
