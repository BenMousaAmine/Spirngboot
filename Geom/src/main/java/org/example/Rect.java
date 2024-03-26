package org.example;

import static java.lang.Math.sqrt;

public class Rect {
    private double  base ;
    private double height ;

    public Rect(int base, int height) {
        this.setBase();
        this.setHeigh(double);
    }

    public Rect() {
    }

    public double getBase() {
        return base;
    }

    public void setBase() {

        this.base = base>0 ? base:0;
    }

    public double getHeigh() {

        return this.height ;
    }

    public double setHeigh(double height) {

        return  (this.height = height>0 ? height:0);
    }

    public double diag (){
        double result ;
        result= sqrt(this.height*this.height + this.base*this.base);
        return result ;
    }

    public double perim () {
        double result ;
        result = (2*this.height) + (2* this.base) ;
        return result ;
    }

    public double aria  () {
        double result = this.height * this.base ;
        return result ;
    }





}
