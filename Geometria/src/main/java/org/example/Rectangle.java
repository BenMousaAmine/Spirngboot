package org.example;
import java.lang.Math;
public class Rectangle extends Shape{
    private double base ;
    private double altezza ;

    public Rectangle(Center centro, double base, double altezza) {
        super(centro);
        this.setBase(base);
        this.setAltezza(altezza);
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double area() {
        return base * altezza;
    }

    public double perimeter() {
        return 2 * (base + altezza);
    }


}
