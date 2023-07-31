package ge.tbc.testautomation.javaoop.figures;

public abstract class Figure {
    public abstract double getArea();

    public abstract double getLength();

    public abstract void printPackageName();

    public static int numberOfInstances = 0;

    public Figure() {
        numberOfInstances++;
    }
}
