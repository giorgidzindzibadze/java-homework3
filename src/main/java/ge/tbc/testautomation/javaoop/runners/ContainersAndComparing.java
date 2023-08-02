package main.java.ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

@SuppressWarnings("all")
public class ContainersAndComparing {
        public static void main(String[] args) {
            ArrayList<String> phoneNumbers = new ArrayList();

            phoneNumbers.add("555-542-231");
            phoneNumbers.add("555-887-987");
            phoneNumbers.add("555-161-143");
            phoneNumbers.add("555-189-6667");

            System.out.println("Phone Numbers: " + phoneNumbers);

            for (int i=0;i<phoneNumbers.size();i++){
                String number=phoneNumbers.get(i);
                System.out.println(number);
            }

//            int i=0;
//            while (i<phoneNumbers.size()){
//                String numer=phoneNumbers.get(i);
//                System.out.println(numer);
//                i++;
//            }

            Iterator<String> iterator = phoneNumbers.iterator();
            while (iterator.hasNext()) {
                String number = iterator.next();
                System.out.println(number);
            }

            HashMap<String, String> phoneBook = new HashMap<>();
            String[] names = {"Georgi", "Lasha", "Saba", "Luka"};

            for (int i = 0; i < names.length && i < phoneNumbers.size(); i++) {
                phoneBook.put(names[i], phoneNumbers.get(i));
            }
            for (String name : phoneBook.keySet()) {
                String phoneNumber = phoneBook.get(name);
                if (phoneNumber.contains("8")) {
                    System.out.println(name);
                }
            }



        }


}