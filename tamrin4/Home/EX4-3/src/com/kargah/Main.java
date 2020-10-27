package com.kargah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("enter the name of student:");
        student.setName(input.nextLine());
        System.out.println("enter the id of student:");
        student.setId(input.nextLine());
        System.out.println("enter the name of the student`s father : ");
        student.setFather(input.nextLine());
        Mark mark1 = new Mark();
        Mark mark2 = new Mark();
        Mark mark3 = new Mark();
        Mark mark4 = new Mark();
        Mark mark5 = new Mark();
        System.out.println("enter mark 1 : " );
        mark1.setMark(input.nextLine());
        System.out.println("enter mark 2 : " );
        mark2.setMark(input.nextLine());
        System.out.println("enter mark 3 : " );
        mark3.setMark(input.nextLine());
        System.out.println("enter mark 4 : " );
        mark4.setMark(input.nextLine());
        System.out.println("enter mark 5 : " );
        mark5.setMark(input.nextLine());
        List<String> list = new ArrayList<>();
        list.add(mark1.getMark());
        list.add(mark2.getMark());
        list.add(mark3.getMark());
        list.add(mark4.getMark());
        list.add(mark5.getMark());
        for (String s : list){
            System.out.println(s);
        }
    }
}
