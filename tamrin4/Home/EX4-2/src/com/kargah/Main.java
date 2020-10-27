package com.kargah;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Person person1 = new Person();
        Person person2 = null;
        Person person3 = null;
        System.out.println("enter the name:");
        person1.setName(input.nextLine());
        System.out.println("enter the family");
        person1.setFamily(input.nextLine());
        System.out.println("the name is :" + person1.getName());
        System.out.println("the family is :" + person1.getFamily());
        try {
            person2 = (Person) person1.clone();
            person3 = (Person) person1.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("clone not supported");
        }
        System.out.println("second person name :" + person2.getName());
        System.out.println("second person family :" + person2.getFamily());
        System.out.println("third person name :" + person3.getName());
        System.out.println("third person name :" + person3.getFamily());
    }
}
