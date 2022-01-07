package org.launchcode.java.studios.countingcharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> tony= new HashMap<>();
//        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String myString = scan.nextLine();
        myString = myString.toLowerCase();

        for (int i=0; i < myString.length(); i++) {
            int asciiValue = myString.charAt(i);
            if (asciiValue> 96 && asciiValue < 123) {
                if(!tony.containsKey(myString.charAt(i))) {
                    tony.put(myString.charAt(i), 1);
                } else {
                    tony.put(myString.charAt(i), tony.get(myString.charAt(i)) +1);
                }
            }

        }
        for (Map.Entry<Character, Integer> entry : tony.entrySet())
            System.out.println(entry.getKey() +" (" + entry.getValue() + ")");
    }
}
