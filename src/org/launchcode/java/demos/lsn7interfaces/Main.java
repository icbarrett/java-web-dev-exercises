package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        System.out.println("\n\nBefore sort: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " number of alergens: " + flavor.getAllergens().size());
        }
        Comparator comparator = new FlavorComparator();

        flavors.sort(comparator);

        System.out.println("\n\nafter sort: ");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " number of alergens: " + flavor.getAllergens().size());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.



        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("\n\nBefore sort: ");
        for (Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("\n\nafter sort: ");
        for (Cone cone : cones) {
            System.out.println("$" +cone.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("\n\nBefore sort: ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());        }


        toppings.sort(new ToppingComparator());

        System.out.println("\n\nafter sort: ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName());
        }
    }


}
