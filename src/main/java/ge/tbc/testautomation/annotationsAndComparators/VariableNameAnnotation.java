package main.java.ge.tbc.testautomation.annotationsAndComparators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface VariableNameAnnotation {
    String name() default "Default value";
}
