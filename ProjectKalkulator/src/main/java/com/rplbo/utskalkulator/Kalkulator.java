package com.rplbo.utskalkulator;

public class Kalkulator {
    BilanganString bil2;
    BilanganString bil1;
    String op;


    Kalkulator(BilanganString inputBil2, BilanganString inputBil1, Operator inputOp) {
        bil2 = inputBil2;
        bil1 = inputBil1;
        op = String.valueOf(inputOp);
    }

    public void hitung() {
    }
}
