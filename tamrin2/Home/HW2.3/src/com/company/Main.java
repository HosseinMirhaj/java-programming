package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberType number = new NumberType();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int temp = input.nextInt();
        number.x = temp;
        number.isEven();
        number.isOdd();
        number.isPositive();
        number.isNegative();
        number.isZero();
    }
}
