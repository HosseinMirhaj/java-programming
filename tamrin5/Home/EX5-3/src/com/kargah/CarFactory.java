package com.kargah;

public class CarFactory {
    public static Car getCar(int c){
            switch (c){
                case 1 :
                    return new LEXUS();
                case 2 :
                    return new TOYOTA();
                case 3 :
                    return new BMW();
                case 4 :
                    return new BENZ();
                case 5 :
                    return new Porsche();
                default:
                    return null;
            }
    }

}
