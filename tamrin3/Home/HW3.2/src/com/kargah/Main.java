package com.kargah;

import java.util.Scanner;

public class Main {
    public static  Equation zarib = new Equation();
    public static int del;
    public static void main(String[] args)throws Exception {
	// write your code here
        //Equation zarib = new Equation();
        System.out.println("delta=b^2-4ac");
        System.out.println("enter a :");
        Scanner input = new Scanner(System.in);
        String tempt = input.nextLine();
        zarib.a = Integer.parseInt(tempt);
        System.out.println("enter b :");
        tempt = input.nextLine();
        zarib.b = Integer.parseInt(tempt);
        System.out.println("enter c :");
        tempt = input.nextLine();
        zarib.c = Integer.parseInt(tempt);
        del = ((zarib.b * zarib.b) - (4 * zarib.a * zarib.c));
        condition();
    }

    private static void condition() throws Exception {
        if (del < 0) {
            throw new Exception("delta manfi ast");
        } else {
            double x1 = (-zarib.b + (Math.sqrt(del))) / (2 * zarib.a);
            System.out.println("x1 :" + x1);
            double x2 = (-zarib.b + (Math.sqrt(del))) / (2 * zarib.a);
            System.out.println("x2 :" + x2);
        }
    }
}
