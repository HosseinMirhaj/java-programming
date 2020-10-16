package com.company;

import java.util.Scanner;

public class Main {
    public static Person person1 = new Person();
    public static Person person2 = new Person();
    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("please enter name of the first person :");
        person1.name = input.nextLine();
        System.out.println("please enter family of the first person :");
        person1.family = input.nextLine();
        System.out.println("plase enter age of the first person :");
        person1.age = input.nextLine();
        System.out.println("please enter name of the second person :");
        person2.name = input.nextLine();
        System.out.println("please enter family of the second person:");
        person2.family = input.nextLine();
        System.out.println("please enter age of the second persn:");
        person2.age = input.nextLine();
        System.out.println(person1.str = person1.name + person1.family + person1.age);
        System.out.println(person2.str = person2.name + person2.family + person2.age);


        try{
            condition();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void condition() throws Exception
    {
        if (person1.str.equals(person2.str)) {
            throw new Exception("information of second person is equal to first person");
        } else {
            System.out.println("person information saved!");
        }
    }
}
