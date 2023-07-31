package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;



    }

    @Override
    public double getArea() {
        return 0.5*h*c;
    }

    @Override
    public double getPerimeter() {
        return a +b+c;
    }
}