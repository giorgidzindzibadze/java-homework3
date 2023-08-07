package main.java.ge.tbc.testautomation.generics;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import ge.tbc.testautomation.javaoop.figures.Circle;
import main.java.ge.tbc.testautomation.javaoop.figures.Rectangle;

@SuppressWarnings("all")
public class Main  {

    private static<K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Class<?> classOne = objOne.getClass();
        Class<?> classTwo = objTwo.getClass();

        Field[] fieldsOne = classOne.getDeclaredFields();
        Field[] fieldsTwo = classTwo.getDeclaredFields();

        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {
        Integer integerObj = Integer.valueOf(42);
        String stringObj = new String("Hello");

        AnyPair<Field[], Field[]> fieldsPair = getDeclaredFields(integerObj, stringObj);

        List<Field> fieldsObj1 = Arrays.asList(fieldsPair.getElementOne());
        List<Field> fieldsObj2 = Arrays.asList(fieldsPair.getElementTwo());

        System.out.println("Fields of Integer class:");
        for (Field field : fieldsObj1) {
            System.out.println(field.getName());
        }
        System.out.println(fieldsObj1);

        System.out.println("\nFields of String class:");
        for (Field field : fieldsObj2) {
            System.out.println(field.getName());
        }

        Circle cir=new Circle(50);
        Rectangle rec = new Rectangle(15.2,10.0) {
            @Override
            public double getLength() {
                return 0;
            }

            @Override
            public void printPackageName() {

            }

        };
        FigurePair<Circle,Rectangle> fig = new FigurePair<>(cir, rec);
        System.out.print(fig);

    }


}