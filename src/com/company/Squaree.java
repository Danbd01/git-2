package com.company;

public class Squaree extends Figure {
    double latura;
    Squaree(double latura){
        this.latura = latura;
    }
    @Override
    double area() {
        return latura * latura;
    }
}
