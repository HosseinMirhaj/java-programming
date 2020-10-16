package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Rectangle mostatil = new Rectangle();
        System.out.println("enter the length of mostatil = ");
        String temp = input.nextLine();
        mostatil.length = Integer.parseInt(temp);
        System.out.println("enter the width of mostatil = ");
        temp = input.nextLine();
        mostatil.width = Integer.parseInt(temp);
        mostatil.perimeter();
        mostatil.area();
        System.out.println();
        Square moraba = new Square();
        System.out.println("enter the side of moraba = ");
        temp = input.nextLine();
        moraba.side = Integer.parseInt(temp);
        moraba.Perimeter();
        moraba.Area();
        System.out.println();
    }
}
