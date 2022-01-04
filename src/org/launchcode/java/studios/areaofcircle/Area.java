package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
      Scanner input  = new Scanner(System.in);
      System.out.println("Enter the radius:");
      Double radius;

      if (!input.hasNextDouble()) {
          System.out.println("Not valid number!");
      } else {
          radius = input.nextDouble();
          while (radius < 0){
              System.out.println(radius + " is not a valid number! Enter a valid number:");
              radius = input.nextDouble();
          }
          System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
      }
//        if (input.hasNextDouble()){
//            radius = input.nextDouble();
//            if (radius>0){
//                System.out.println("The area of a circle of radius " + radius + " is " + Circle.getArea(radius));
//            } else {
//                System.out.println(radius + " is not a valid number!");
//            }
//        } else {
//            System.out.println("Please enter a valid number!");
//        }


    }
}


