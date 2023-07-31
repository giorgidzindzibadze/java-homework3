package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure implements IResizableCircle,IValidCircle {

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.radius > 0;
    }
    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        double newRadius = circle.radius * 2;
        return new Circle(newRadius);}

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byValue) {
        double newRadius = circle.radius * byValue;
        return new Circle(newRadius);}

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {

        Package pkg = getClass().getPackage();
        if (pkg != null) {
            System.out.println("Package name: " + pkg.getName());
        } else {
            System.out.println("Package name: No package information available.");
        }
    }


    private double radius;

    public Circle(double radius) {
        super();
        if (numberOfInstances > 5) {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
        if (radius < 0) {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
