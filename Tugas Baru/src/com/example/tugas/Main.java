package com.example.tugas;

public class Main {
    public static void main(String[] args) {
        Persegi p1 = new Persegi("Persegi 1", 5);
        p1.printDetail();
        System.out.println(p1.luas());
        System.out.println(p1.keliling());
    }

}
