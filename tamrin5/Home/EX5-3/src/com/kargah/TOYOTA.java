package com.kargah;

public class TOYOTA implements Car {
    @Override
    public void country() {
        System.out.println("TOYOTA is japanese company");
    }

    @Override
    public void carmodel() {
        System.out.println("car model :\n 1.LandCruiser\n2.Prado\n3.C-HR 4WD\n4.RAV4 \n5.Hilux ");
    }
}
