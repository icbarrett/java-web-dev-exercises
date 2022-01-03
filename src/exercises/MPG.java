package exercises;
import java.util.Scanner;
public class MPG {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the miles driven");
        double miles = input.nextDouble();

        System.out.println("Enter the gallons of gas");
        double gallons = input.nextDouble();

        double mpg = miles/gallons;

        System.out.println("Your miles per gallon is " + mpg);
    }
}
