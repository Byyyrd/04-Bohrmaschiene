package com.company;

public class Main {

    public static void main(String[] args) {
        DrillingMachine d1 = new DrillingMachine();
        DrillingMachine d2 = new DrillingMachine();
        DrillingMachine d3 = new DrillingMachine();

        d1.showInfos();
        System.out.println(d1.getInfo());
    }
}
