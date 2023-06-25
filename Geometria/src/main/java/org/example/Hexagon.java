package org.example;

public class Hexagon extends Shape{

    private double side;

    public Hexagon(Center centro, double side) {
        super(centro);
        this.setSide(side);
    }

    public double area() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    public double perimeter() {
        return 6 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
