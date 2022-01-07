package org.launchcode.java.studios.countingcharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> tony= new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] characterInString = myString.toCharArray();

        for (char ch : characterInString) {
             if(!tony.containsKey(ch)) {
                tony.put(ch, 1);
             } else {
                 tony.put(ch, tony.get(ch) +1);
             }
        }
        for (Map.Entry<Character, Integer> entry : tony.entrySet())
            System.out.println(entry.getKey() +" (" + entry.getValue() + ")");
    }
}
