package com.company;

public class Square {
    public double side;


    public Square(double side) {
        this.side = side;


    }


    double getPerimetru() {
        return (side + side + side + side);
    }

    public double getArea() {
        double area = side * side;

        return area;
    }
}
