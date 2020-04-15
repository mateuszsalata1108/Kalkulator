package com.company;

public class Kalkulator {
    double x = 0;
    double y = 0;

    Kalkulator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void dodaj() {
        System.out.println(x + y);
    }

    public void odejmij() {
        System.out.println(x - y);
    }
}
