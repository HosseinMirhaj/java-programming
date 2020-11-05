package com.kargah;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person = new Person();
        person.setUsername("HOSSEINMIRHAJ");
        person.setPassword("H1234");
        person.setName("hossein");
        person.setAge(20);
        person.setEducation("diplom");
        person.setNumber("9355376379");
        person.setAddress("Tehran");
        System.out.println(person.getName());
        System.out.println(person.getUsername());
        System.out.println(person.getPassword());
        System.out.println(person.getAge());
        System.out.println(person.getEducation());
        System.out.println(person.getNumber());
        System.out.println(person.getAddress());
    }
}
