package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        int[]  arrayInt = {
                1, 1, 2, 3, 5, 8
        };
//        for (int i : arrayInt) {
//            System.out.println(i);
//        }
//        for (int i : arrayInt) {
//            if (i % 2 == 1) {
//                System.out.println(i);
//            };
//        };



        String string = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

        String[] stringArray = string.split(" ");
        System.out.println(Arrays.toString(stringArray));

        String[] stringTwo = string.split("\\.");
        System.out.println(Arrays.toString(stringTwo));
    }
}
