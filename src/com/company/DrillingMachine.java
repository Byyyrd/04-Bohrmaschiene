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
        this.price = ((int)((Math.random()*450+50)*100))/100d;
        this.broken = false;
    }
    public void  becomeBroken(){
        this.broken = true;
    }
    public void  repair(){
        if(this.broken == true){
            this.broken = false;
            this.price = this.price/2;
        }
    }
    public void aging(){
        this.age += 1;
        if (this.age >= 10){
            this.broken = true;
        }
    }
    public void reactOnHighDemand(){
        this.price *= 1.25;
    }

    public void setBroken(boolean isBroken) {
        this.broken = isBroken;
    }

    public void increasePrice(double amount) {
        this.price += price;
    }
    public void changePower(int watt){
        if(watt > 0){
            this.watt += watt;
            if(watt > 100){
                this.price *= 1.05;
            }
        }else if(watt != 0){
            this.watt += watt;
            this.price *= 0.9;
        }
    }

    public double getPrice() {
        return price;
    }

    public boolean isInexpensive(){
        if(watt > 500 && price < 50){
            return true;
        }else{
            return false;
        }
    }
    public double getPricePerWatt(){
        return price/watt;
    }
    public boolean increasePriceByPercentage(double percentage){
        if(percentage > 0.0){
            this.price += price * percentage;
        }
        if (this.price > 100){
            return true;
        }
        return false;
    }
    public boolean repair2(){
        if(this.broken){
            this.broken = false;
            return true;
        }
        return false;
    }
    public String getInfo(){
        return "Der "+name+" kostet nur "+price+"€ mit einer Leistung von "+watt+" Watt und dem geringen Alter von "+age+" Jahren!!!!";
    }
    public void showInfos() {
        System.out.println("Name: " + name + " - " + "Watt: " + watt + " - " + "Age: " + age + " - " + "Price: " + price + " - " + "Broken? " + (broken? "Yes":"No"));
    }
}
