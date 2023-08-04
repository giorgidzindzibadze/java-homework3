package main.java.ge.tbc.testautomation.annotationsAndComparators;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        double area1 = r1.getA() * r1.getB();
        double area2 = r2.getA() * r2.getB();

        if (area1 > area2) {
            return -1;
        } else if (area1 < area2) {
            return 1;
        } else {
            return 0;
        }
    }



    public class Main {
        public static void main(String[] args) {
            List<Rectangle> rectangles = new ArrayList<>();

            rectangles.add(new Rectangle(5, 8));
            rectangles.add(new Rectangle(3, 7));
            rectangles.add(new Rectangle(4, 6));
            rectangles.add(new Rectangle(2, 9));
            rectangles.add(new Rectangle(6, 4));
            rectangles.add(new Rectangle(7, 3));
            rectangles.add(new Rectangle(8, 5));
            rectangles.add(new Rectangle(1, 10));
            rectangles.add(new Rectangle(9, 2));
            rectangles.add(new Rectangle(10, 1));

            System.out.println("Original list:");
            for (Rectangle rectangle : rectangles) {
                System.out.println(rectangle);
            }


        }
    }
}