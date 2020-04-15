package com.company;

import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Kalkulator kalkulatorPodstawowy = new Kalkulator(5, 7);
        kalkulatorPodstawowy.dodaj();
        kalkulatorPodstawowy.odejmij();
        KalkulatorStatystyczy kalkulatorStatystyczy = new KalkulatorStatystyczy(5, 7, 1);
        kalkulatorStatystyczy.dodaj();
        kalkulatorStatystyczy.odejmij();
        kalkulatorStatystyczy.sinus();
    }
}
