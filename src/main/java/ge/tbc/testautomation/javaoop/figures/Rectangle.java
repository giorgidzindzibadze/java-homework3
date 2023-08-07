package main.java.ge.tbc.testautomation.javaoop.figures;


import main.java.ge.tbc.testautomation.javaoop.figures.Figure;

public abstract class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;

    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "This is rectangle with " + a + " and " + b + " parameters";
    }

    public double getPerimeter() {
        return 2*(a+b);
    }


}