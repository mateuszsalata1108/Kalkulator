package com.company;

public class KalkulatorStatystyczy extends Kalkulator {
    double z = 0;

    KalkulatorStatystyczy(double x, double y, double z) {
        super(x, y);
        this.z=z;
    }

    public void sinus(){
        System.out.println(Math.sin(z));
    }
}
