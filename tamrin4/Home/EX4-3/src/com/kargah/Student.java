package com.kargah;

public class Student<NAME, ID, FATHER> {
    private NAME name ;
    private  ID id;
    private  FATHER father;

    public void setName(NAME name) {
        this.name = name;
    }

    public NAME getName() {
        return name;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public ID getId() {
        return id;
    }

    public void setFather(FATHER father) {
        this.father = father;
    }

    public FATHER getFather() {
        return father;
    }
}
