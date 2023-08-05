package main.java.ge.tbc.testautomation.annotationsAndComparators;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
public class Analyzable  {

    @VariableNameAnnotation(name = "Integer")
    private static int inte;

    @VariableNameAnnotation(name = "String")
    private static String stra;

    @VariableNameAnnotation(name = "Double")
    private double doub;

    @VariableNameAnnotation()
    private boolean bool;

    @VariableNameAnnotation(name = "Something")
    private char cha;

    @VariableNameAnnotation(name = "Float")
    private float Float;

    @VariableNameAnnotation(name = "Byte")
    private byte Byte;

    @VariableNameAnnotation(name = "Short")
    private short shor;

    @VariableNameAnnotation(name = "Long")
    private long lon;

    @VariableNameAnnotation(name = "IntArray")
    private int[] intArrayVar;

    @VariableNameAnnotation(name = "DoubleArrayVar")
    private double[] doubleArray;




    public static void main(String[] args) {

        Analyzable analyzable = new Analyzable();
        Field[] fields = analyzable.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(VariableNameAnnotation.class)) {
                VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                String expectedName = annotation.name();
                String actualName = field.getName();

                if (!expectedName.equalsIgnoreCase(actualName)) {
                    System.out.println("VARIABLE NAME MISMATCH FOUND: " + actualName);
                }
            }
        }


            int unused1, unused2, unused3;

        ArrayList<Integer> integerList = new ArrayList<>();


        integerList.add(5);
        integerList.add(2);
        integerList.add(9);
        integerList.add(1);
        integerList.add(8);
        integerList.add(3);
        integerList.add(6);
        integerList.add(7);
        integerList.add(4);
        integerList.add(10);

        System.out.println("Original list: " + integerList);

        Collections.sort(integerList);

        System.out.println("Sorted list: " + integerList);

        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(3, 1));
        rectangles.add(new Rectangle(4, 1));
        rectangles.add(new Rectangle(6, 1));
        rectangles.add(new Rectangle(5, 1));
        rectangles.add(new Rectangle(7, 1));
        rectangles.add(new Rectangle(8, 1));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(9, 1));
        rectangles.add(new Rectangle(10, 1));

        Collections.sort(rectangles, new RectangleComparator());

        System.out.println("Original list:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }


    }
}
