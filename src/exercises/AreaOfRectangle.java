package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        double length = input.nextDouble();

        System.out.println("Enter width of rectangle:");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area is " + area);


    }

}
