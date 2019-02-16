package com.company;

public class Cat extends Animal {
    String color  = "Black";

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
     public void sayName(){
        System.out.println("I'm a Cat!");
        super.sayName();

    }






}