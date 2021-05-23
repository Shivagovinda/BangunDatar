package com.example.tugas;

public class Lingkaran extends BangunDatar {
    private float phi = (float) 3.14;
    private int jariJari;

    public Lingkaran(String nama, int jariJari){
        super(nama);
        this.jariJari = jariJari;
    }

    public int getJariJari() {return jariJari;}

    public void setJariJari(int jariJari) {this.jariJari = jariJari;}

    @Override
    public void printDetail() {
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
    }

    public String luas() {
        float luas = this.phi * (this.jariJari * this.jariJari);
        return "Luas Lingkaran dengan jari - jari " + this.jariJari + " adalah: " + luas;
    }

    public String keliling() {
        float keliling = this.phi * (2 * this.jariJari);
        return "Keliling Lingkaran dengan jari - jari " + this.jariJari + " adalah: " + keliling;
    }
}
