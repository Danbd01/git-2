package com.company;

public class Film {
    String denumire;
    int aprecieri;

    void aprecieri(){
        aprecieri = aprecieri + 1;
    }
    public Film(String name){
        this.denumire = name;
    }


    void printMovie(){
        System.out.println("Numele: " + denumire + ", Aprecieri: " + aprecieri + ";");
    }
}
