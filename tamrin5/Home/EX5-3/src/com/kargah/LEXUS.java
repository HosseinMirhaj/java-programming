package com.kargah;

public class LEXUS implements Car{
    @Override
    public void country() {
        System.out.println("LEXUS is japanese company");
    }

    @Override
    public void carmodel() {
        System.out.println("car model : \n1.NX 200 turbo \n2.NX 300h HYBRID\n3.RX 200 turbo");
    }
}
