package com.company;

public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine(){
        this.name = "jKainator3001";
        this.watt = (int)(Math.random()*1201+800);
        this.age = (int)(Math.random()*10);
        this.price = (int)(Math.random()*450+50);
        this.broken = false;
    }
    public void  becomeBroken(){
        this.broken= true;
    }
    public void  repair(){
        this.broken= false;
    }
    public void aging(){
        this.age += 1;
        if (this.age >= 10){
            this.broken = true;
        }
    }
    public void reactOnHighDemand(){
        this.price += this.price * 0.25;
    }
}
