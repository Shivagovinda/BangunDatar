package com.example.tugas;

import com.example.tugas.BangunDatar;

public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(String nama, int sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void printDetail() {
        System.out.println("Menghitung Luas dan Keliling Persegi");
    }

    public String luas() {
        int luas = this.sisi * this.sisi;
        return "Luas persegi dengan sisi " + this.sisi + " adalah: " + luas;
    }

    public String keliling() {
        int keliling = 4 * this.sisi;
        return "Keliling persegi dengan sisi " + this.sisi + " adalah: " + keliling;
    }
}

