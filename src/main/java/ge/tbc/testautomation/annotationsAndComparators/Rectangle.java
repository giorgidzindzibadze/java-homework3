package main.java.ge.tbc.testautomation.annotationsAndComparators;

import main.java.ge.tbc.testautomation.javaoop.figures.Figure;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle [a=" + a + ", b=" + b + "]";
    }

    public double getArea(){
        return a*b;
    }

    @Override
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {

    }
}
