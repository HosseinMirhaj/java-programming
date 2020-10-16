package com.kargah;

import java.util.Scanner;

public class Main {
    public static Str str =new Str();
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string");
        str.st =input.nextLine();
        try {
            condition();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void condition() throws Exception {
        String s[]=str.st.split("");
        for(String i : s){
            if( i.equals("0") ||  i.equals("1") || i.equals("2") || i.equals("3") || i.equals("4") || i.equals("5") || i.equals("6") || i.equals("7") || i.equals("8") || i.equals("9")  ){
                throw new Exception("the string have number!!!");
            }
        }
        System.out.println("the string length is : " + str.st.length());
    }
}
