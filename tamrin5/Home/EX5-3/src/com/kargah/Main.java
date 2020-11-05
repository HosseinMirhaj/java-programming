package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("The list of company is:");
        System.out.println("1.Lexus\n2.Toyota\n3.BMW\n4.Benz\n5.Porsche\n");
        System.out.println("please choose your company :");
        int x = input.nextInt();
        Car car = CarFactory.getCar(x);
        car.country();
        car.carmodel();
    }
}
