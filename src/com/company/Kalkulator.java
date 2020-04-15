package com.company;

public class Kalkulator {
    int x=0;
    int y=0;
    Kalkulator(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void dodaj(int a, int b){
        System.out.println(a+b);
    }
    public void odejmij(int a, int b){
        System.out.println(a-b);
    }
}
