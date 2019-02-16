package com.company;

public class Student {
    private int age;


    public void setAge(int age){
        if (age<0){
            System.out.println("Introdu varsta corecta!");
        } else {
            this.age = age;
        }

    }
    public int getAge(){
        return this.age;

    }




}

