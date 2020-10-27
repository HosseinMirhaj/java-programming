package com.kargah;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        Map std = new TreeMap();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name of the student:");
        student.setName(input.nextLine());
        std.put("name",student.getName());
        System.out.println("enter the user of student:");
        student.setUser(input.nextLine());
        std.put("user",student.getUser());
        System.out.println("enter grade of student:");
        student.setGrade(input.nextInt());
        std.put("grade",student.getGrade());
        System.out.println("name is:"+ std.get("name"));
        System.out.println("user is:"+std.get("user"));
        System.out.println("grade is:"+std.get("grade"));
    }
}
