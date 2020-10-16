package com.kargah;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Main {
    public static Student St = new Student();
    public static String st_name = "hossein";
    public static String st_username = "hosseinmir";
    public static String st_password = "hmir1379";

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name :");
        St.name = input.nextLine();
        System.out.println("enter your username :");
        St.username = input.nextLine();
        System.out.println("enter your password");
        St.password = input.nextLine();
        try {
            condition();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void condition() throws Exception {
        if (!St.name.equals(st_name) || !St.username.equals(st_username) || !St.password.equals(st_password)) {
            throw new Exception("your information is wrong!!!");
        }else if (St.name.equals(st_name) && St.username.equals(st_username) && St.password.equals(st_password)){
            System.out.println(St.name);
            System.out.println(St.username);
            System.out.println(St.password);
        }
    }

}
