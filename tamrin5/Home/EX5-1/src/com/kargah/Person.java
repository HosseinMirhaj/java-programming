package com.kargah;

public class Person {
    private String username;
    private String name;
    private String password;
    private String address;
    private String number;
    private int age;
    private String education;

    private Person(String username,String name,String password,String address,
                   String number , int age, String education){
        this.username = username;
        this.password = password;
        this.name = name ;
        this.age = age ;
        this.education = education ;
        this.number = number;
        this.address = address ;
    }
    Person(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
