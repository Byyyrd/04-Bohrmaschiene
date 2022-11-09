package com.company;

public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine(){
        this.name = "jKainator3001";
        this.watt = (int)Math.random()*1201+800;
        this.age = (int)Math.random()*10;
        this.price = (int)Math.random()*450+50;
        this.broken = false;
    }

}
