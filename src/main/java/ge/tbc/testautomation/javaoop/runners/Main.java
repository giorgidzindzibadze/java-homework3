package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            Circle circle = new Circle(-5.0);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());
        }

        try {
            Circle circle2 = new Circle(7.6);
            Circle circle3 = new Circle(8.0);
            Circle circle4 = new Circle(9.65);
            Circle circle5 = new Circle(10.0);
            Circle circle6 = new Circle(13.0);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }

        String sentence = "Test Automation Bootcamp 6, 2022";
        String automation = sentence.substring(5, 15).toLowerCase();
        System.out.println(automation);

        String[] wordsArray = sentence.split(" ");
        for (String word : wordsArray) {
            System.out.println(word);
        }

        int len = "Test Automation Bootcamp".length();
        System.out.println(len);

        String repSentence = sentence.replace(" ", "-");
        System.out.println(repSentence);


        String[] phoneNumbers = { "599-144-155", "595-123-456-789", "555-987-654-321" };
        System.out.println(phoneNumberValidation(phoneNumbers[0].replace("-", "")));
        System.out.println(phoneNumberValidation(phoneNumbers[1].replace("-", "")));
        System.out.println(phoneNumberValidation(phoneNumbers[2].replace("-", "")));
        for (String phoneNumber : phoneNumbers) {
            boolean isValid = phoneNumberValidation(phoneNumber.replace("-", ""));
            System.out.println(phoneNumber + " is " + (isValid ? "valid" : "invalid"));
        }
    }

    private static boolean phoneNumberValidation(String phoneNumber) {
        String regexPattern = "^(555|595|592|599)\\d{6}$";
        return phoneNumber.matches(regexPattern);
    }

}