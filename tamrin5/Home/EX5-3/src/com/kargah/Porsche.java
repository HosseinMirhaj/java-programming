package com.kargah;

public class Porsche implements Car {
    @Override
    public void country() {
        System.out.println("porsche is german car company.");

    }

    @Override
    public void carmodel() {
        System.out.println("car model :\n1.Macan\n2.Boxter 718s\n3.Panamera\n4.911 Carrera");
    }
}
