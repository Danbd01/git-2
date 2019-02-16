package com.company;

public class Circle extends Figure {
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area() {

        return radius * radius * Math.PI;
    }
}
