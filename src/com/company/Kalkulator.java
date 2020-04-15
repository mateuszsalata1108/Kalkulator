package com.company;

public class Kalkulator {
    double x=0;
    double y=0;
    Kalkulator(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void dodaj(double a, double b){
        System.out.println(a+b);
    }
    public void odejmij(double a, double b){
        System.out.println(a-b);
    }
}
