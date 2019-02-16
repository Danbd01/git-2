package com.company;

public class Animal {
    String color = "Grey";
    protected int NrOfLegs;

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                '}';
    }

    public void DisplayObject(){
        System.out.println(color + " " + NrOfLegs);
    }

    public void sayName(){
        System.out.println("I'm an Animal!");
    }

}
