package org.example;

public class Circle extends Shape {
    private double diametro ;

    private double radius;

    public Circle( Center centro ,double radius) {
        super(centro);
        this.setRadius(radius);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
