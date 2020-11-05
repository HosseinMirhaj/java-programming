package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter your user name:");
        Site.getInstance().setUser(input.nextLine());
        System.out.println("enter your password:");
        Site.getInstance().setPass(input.nextLine());
        System.out.println("your user name :"+Site.getInstance().getUser());
        System.out.println("your password is :"+Site.getInstance().getPass());
    }
}
