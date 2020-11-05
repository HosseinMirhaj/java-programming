package com.kargah;

public class BENZ implements Car {
    @Override
    public void country() {
        System.out.println("benz is german car company.");

    }

    @Override
    public void carmodel() {
        System.out.println("car model :\n1.s500\n2.e250\n3.e240");

    }
}
