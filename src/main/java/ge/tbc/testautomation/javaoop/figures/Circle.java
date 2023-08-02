package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import main.java.ge.tbc.testautomation.javaoop.figures.Figure;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

public class Circle extends Figure implements IResizableCircle,IValidCircle,Comparable<Circle>  {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


    public int compareTo(Circle other) {
        if (this.radius > other.getRadius()) {
            return 1;
        } else if (this.radius < other.getRadius()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);
        Circle circle3 = new Circle(3.0);
        Circle circle4 = new Circle(5.0);

        int compareResult1 = circle1.compareTo(circle2);
        int compareResult2 = circle1.compareTo(circle3);
        int compareResult3 = circle1.compareTo(circle4);

        System.out.println("compare result between circle1 and circle2: " + compareResult1);
        System.out.println("compare result between circle1 and circle3: " + compareResult2);
        System.out.println("compare result between circle1 and circle4: " + compareResult3);
        System.out.println(circle3.toString());

        TreeSet<Circle> circleSet = new TreeSet<>();

        circleSet.add(new Circle(5.0));
        circleSet.add(new Circle(3.5));
        circleSet.add(new Circle(7.5));
        circleSet.add(new Circle(2.0));
        circleSet.add(new Circle(6.5));
        circleSet.add(new Circle(3.5));
        circleSet.add(new Circle(4.5));
        circleSet.add(new Circle(6.5));
        circleSet.add(new Circle(1.0));
        circleSet.add(new Circle(2.0));


        for (Circle circle : circleSet) {
            System.out.println(circle);
        }



        HashSet<Circle> circleSet2 = new HashSet<>();

        circleSet2.add(new Circle(5.0));
        circleSet2.add(new Circle(3.5));
        circleSet2.add(new Circle(7.5));
        circleSet2.add(new Circle(2.0));
        circleSet2.add(new Circle(6.5));
        circleSet2.add(new Circle(3.5));
        circleSet2.add(new Circle(4.5));
        circleSet2.add(new Circle(6.5));
        circleSet2.add(new Circle(1.0));
        circleSet2.add(new Circle(2.0));


        System.out.println("Circle Set:");
        for (Circle circl : circleSet2) {
            System.out.println(circl);
        }
    }







    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

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
//            System.out.println("Package name: " + pkg.getName());
        } else {
//            System.out.println("Package name: No package information available.");
        }
    }


}
