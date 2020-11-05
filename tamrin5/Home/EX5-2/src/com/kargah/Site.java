package com.kargah;

public class Site {

    private String pass;
    private String user;

    private static Site person = new Site();
    public static Site getInstance(){
        return person;
    }
    private Site(){}

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public static Site getPerson() {
        return person;
    }

    public static void setPerson(Site person) {
        Site.person = person;
    }
}
