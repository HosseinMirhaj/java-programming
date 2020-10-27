package com.kargah;

public class Person<NAME, FAMILY> implements Cloneable {
    public NAME name ;
    public FAMILY family ;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public FAMILY getFamily() {
        return family;
    }

    public void setFamily(FAMILY family) {
        this.family = family;
    }
        @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
        }
}
