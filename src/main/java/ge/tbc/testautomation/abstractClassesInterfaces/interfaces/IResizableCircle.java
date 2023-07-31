package ge.tbc.testautomation.abstractClassesInterfaces.interfaces;

import ge.tbc.testautomation.javaoop.figures.Circle;

public interface IResizableCircle {
    Circle returnDoubleSizedCircle(Circle circle);
    Circle returnCustomSizedCircle(Circle circle, double byValue);
}
