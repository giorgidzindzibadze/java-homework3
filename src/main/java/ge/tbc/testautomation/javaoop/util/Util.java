package ge.tbc.testautomation.javaoop.util;

import ge.tbc.testautomation.javaoop.figures.Circle;

public class Util {
    public static String circleToString(Circle circle) {
        return "[Circle: radius - " + circle.getRadius() + "]";
    }

}