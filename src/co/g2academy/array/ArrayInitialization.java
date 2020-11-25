package co.g2academy.array;

import co.g2academy.basic.MyDate;

public class ArrayInitialization {

    private String[] names;
    private String[] simpleNames = {"Giorgiana", "Jen", "Simon"};

    private MyDate[] dates;
    private MyDate[] simpleDates = {
            new MyDate(22, 7, 1964),
            new MyDate(1, 1, 2000),
            new MyDate(22, 12, 1964)
    };


    public ArrayInitialization() {
        names = new String[3];
        names[0] = "Giorgiana";
        names[1] = "Jen";
        names[2] = "Simon";

        dates = new MyDate[3];
        dates[0] = new MyDate(22, 7, 1964);
        dates[1] = new MyDate(1, 1, 2000);
        dates[2] = new MyDate(22, 12, 1964);
    }

    public String[] getNames() {
        return names;
    }

    public String[] getSimpleNames() {
        return simpleNames;
    }

    public MyDate[] getDates() {
        return dates;
    }

    public MyDate[] getSimpleDates() {
        return simpleDates;
    }
}
