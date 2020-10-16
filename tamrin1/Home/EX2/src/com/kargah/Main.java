package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("please enter the amount of your mark: ");
        int n;
        int c = 0;
        int b = 0;
        n = new Scanner(System.in).nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println("enter the mark of " + i  + " lesson");
            int a;
            a = new Scanner(System.in).nextInt();
            System.out.println("Then Enter The Factor Of That Lesson:");
            b = new Scanner(System.in).nextInt();
            c = (a * b);
        }
        int sum = 0 ;
        for (int i = 0; i <= n; i++) {
            sum += c;
        }
        int sum1 = 0 ;
        for (int i = 0; i <= n; i++){
            sum1 += b;
        }
        int average = 0;
        average = sum / sum1;
        if (average > 12) {
            System.out.println("you are passed");
        } else {
            System.out.println("your are failed");
        }

    }
}
