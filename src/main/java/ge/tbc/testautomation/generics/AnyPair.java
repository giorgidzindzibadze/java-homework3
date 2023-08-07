package main.java.ge.tbc.testautomation.generics;

public class AnyPair<E, T> {
    private E elementOne;
    private T elementTwo;

    public AnyPair(E elementOne, T elementTwo) {
        this.elementOne = elementOne;
        this.elementTwo = elementTwo;
    }

    public E getElementOne() {
        return elementOne;
    }

    public void setElementOne(E elementOne) {
        this.elementOne = elementOne;
    }

    public T getElementTwo() {
        return elementTwo;
    }

    public void setElementTwo(T elementTwo) {
        this.elementTwo = elementTwo;
    }

    @Override
    public String toString() {
        return "AnyPair{" +
                "elementOne=" + elementOne +
                ", elementTwo=" + elementTwo +
                '}';
    }




}
