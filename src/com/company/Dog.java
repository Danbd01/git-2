package com.company;

public class Dog extends Animal {
    String color = "Red";

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void sayName(){
        System.out.println("I'm a Dog!");
    }
}
